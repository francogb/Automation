/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Context.Adulto;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Franco.Garcia
 */
public class XMLHelper {
    public static Adulto adulto;
    
    public static void generarXml() {
        try{
        Adulto adult= new Adulto("nombre","apellido", "dia", "mes", "anio", "email", "telefono");
        File file = new File("src/main/java/Context/Adulto.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(Adulto.class);
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        jaxbMarshaller.marshal(adult, file);
        jaxbMarshaller.marshal(adult, System.out);
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    
    
}
