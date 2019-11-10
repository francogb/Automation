/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import Config.DataSetter;
import java.io.File;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Franco.Garcia
 */
public class EmailSender {

    public static EmailSenderConfiguration emailConfiguration;

    public static void getEmailDeliveryConfiguration() {
        try {
            File file = new File(DataSetter.configuration.getDeliveryPath());
            JAXBContext jaxbContext = JAXBContext.newInstance(EmailSenderConfiguration.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            emailConfiguration = (EmailSenderConfiguration) jaxbUnmarshaller.unmarshal(file);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void initializeEmailDeliveryConfiguration() {
        getEmailDeliveryConfiguration();
    }


    public static void sendEmail() {
        String from = emailConfiguration.getEmailFrom();
        Properties props = new Properties();
        props.put("mail.smtp.auth", emailConfiguration.getEmailAuth());
        props.put("mail.smtp.starttls.enable", emailConfiguration.getEmailStarttls());
        props.put("mail.smtp.host", emailConfiguration.getSmtpHost());
        props.put("mail.smtp.port", emailConfiguration.getPort());

        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(emailConfiguration.getUser(), emailConfiguration.getPassword());
            }
        });
        
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            for (String e : emailConfiguration.getEmailGroup()) {
                message.addRecipient(Message.RecipientType.TO, new InternetAddress(e));
            }
            
            message.setSubject("Alerta de automatización");
            BodyPart messageBodyPart = new MimeBodyPart();
            javax.mail.Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            
            messageBodyPart = new MimeBodyPart();
            for (String p : emailConfiguration.getAttachedFilesPath()) {
                if (p != null && p.length() > 0){
                    DataSource source = new FileDataSource(p);
                    messageBodyPart.setDataHandler(new DataHandler(source));
                    messageBodyPart.setFileName(p);
                    multipart.addBodyPart(messageBodyPart);
                }
            }
            message.setContent(multipart);
            message.setContent("Es una prueba", "text/html");
            Transport.send(message);
            System.out.println("El mensaje fue enviado");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
