/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Report;

import Config.DataSetter;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author matia
 */
@XmlRootElement
public class ReportConfiguration {

    public static String path;
    public static String titleAddTitle;
    public static String titleAddSubject;
    public static String titleAddKeyWords;
    public static String titleAddAutor;
    public static String titleAddCreator;
    public static String titleTitle;
    public static String titleReportBy;
    public static String titleIntroDetails;
    public static String titleSecondTitle;
    public static String titleSecondDetails;
    public static String titleThirdTitle;
    public static String titleThirdDetails;
    public static String testContentTitle;
    public static String testContentExecuteBy;
    public static String testContentTestDescription;
    public static String testContentObjetiveDescription;
    public static ReportConfiguration reportConfiguration;

    public static ReportConfiguration getInstance() {
        if (reportConfiguration == null) {
            reportConfiguration = new ReportConfiguration();
            return reportConfiguration;
        } else {
            return reportConfiguration;
        }
    }

    public String getPath() {
        return path;
    }

    @XmlElement
    public void setPath(String item) {
        path = item;
    }

    public String getTitleAddTitle() {
        return titleAddTitle;
    }

    @XmlElement
    public void setTitleAddTitle(String item) {
        titleAddTitle = item;
    }

    public String getTitleAddSubject() {
        return titleAddSubject;
    }

    @XmlElement
    public void setTitleAddSubject(String item) {
        titleAddSubject = item;
    }

    public String getTitleAddKeyWords() {
        return titleAddKeyWords;
    }

    @XmlElement
    public void setTitleAddKeyWords(String item) {
        titleAddKeyWords = item;
    }

    public String getTitleAddAutor() {
        return titleAddAutor;
    }

    @XmlElement
    public void setTitleAddAutor(String item) {
        titleAddAutor = item;
    }

    public String getTitleAddCreator() {
        return titleAddCreator;
    }

    @XmlElement
    public void setTitleAddCreator(String item) {
        titleAddCreator = item;
    }

    public String getTitleTitle() {
        return titleTitle;
    }

    @XmlElement
    public void setTitleTitle(String item) {
        titleTitle = item;
    }

    public String getTitleReportBy() {
        return titleReportBy;
    }

    @XmlElement
    public void setTitleReportBy(String item) {
        titleReportBy = item;
    }

    public String getTitleIntroDetails() {
        return titleIntroDetails;
    }

    @XmlElement
    public void setTitleIntroDetails(String item) {
        titleIntroDetails = item;
    }

    public String getTitleSecondTitle() {
        return titleSecondTitle;
    }

    @XmlElement
    public void setTitleSecondTitle(String item) {
        titleSecondTitle = item;
    }

    public String getTitleSecondDetails() {
        return titleSecondDetails;
    }

    @XmlElement
    public void setTitleSecondDetails(String item) {
        titleSecondDetails = item;
    }

    public String getTitleThirdTitle() {
        return titleThirdTitle;
    }

    @XmlElement
    public void setTitleThirdTitle(String item) {
        titleThirdTitle = item;
    }

    public String getTitleThirdDetails() {
        return titleThirdDetails;
    }

    @XmlElement
    public void setTitleThirdDetails(String item) {
        titleThirdDetails = item;
    }

    public String getTestContentTitle() {
        return testContentTitle;
    }

    @XmlElement
    public void setTestContentTitle(String item) {
        testContentTitle = item;
    }

    public String getTestContentExecuteBy() {
        return testContentExecuteBy;
    }

    @XmlElement
    public void setTestContentExecuteBy(String item) {
        testContentExecuteBy = item;
    }

    public String getTestContentTestDescription() {
        return testContentTestDescription;
    }

    @XmlElement
    public void setTestContentTestDescription(String item) {
        testContentTestDescription = item;
    }

    public String getTestContentObjetiveDescription() {
        return testContentObjetiveDescription;
    }

    @XmlElement
    public void setTestContentObjetiveDescription(String item) {
        testContentObjetiveDescription = item;
    }

    public static void getReportConfig() {
        try {
            File file = new File(DataSetter.configuration.getReportPath());
            JAXBContext jaxbContext = JAXBContext.newInstance(ReportConfiguration.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            ReportConfiguration obj = (ReportConfiguration) jaxbUnmarshaller.unmarshal(file);
            titleAddAutor = obj.getTitleAddAutor();
            path = obj.getPath();
            titleAddTitle = obj.getTitleAddTitle();
            titleAddSubject = obj.getTitleAddSubject();
            titleAddKeyWords = obj.getTitleAddKeyWords();
            titleAddAutor = obj.getTitleAddCreator();
            titleAddCreator = obj.getTitleAddAutor();
            titleTitle = obj.getTitleTitle();
            titleReportBy = obj.getTitleReportBy();
            titleIntroDetails = obj.getTitleIntroDetails();
            titleSecondTitle = obj.getTitleSecondTitle();
            titleSecondDetails = obj.getTitleSecondDetails();
            titleThirdTitle = obj.getTitleThirdTitle();
            titleThirdDetails = obj.getTitleThirdDetails();
            testContentTitle = obj.getTestContentTitle();
            testContentExecuteBy = obj.getTestContentExecuteBy();
            testContentTestDescription = obj.getTestContentTestDescription();
            testContentObjetiveDescription = obj.getTestContentObjetiveDescription();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void cerrarReporte() {
        Report.generatePdfReport();
    }

    public static void generateConfiguration() {
        try {
            ReportConfiguration rep = ReportConfiguration.getInstance();
            rep.setPath("");
            rep.setTestContentExecuteBy("");
            rep.setTestContentObjetiveDescription("");
            rep.setTestContentTestDescription("");
            rep.setTestContentTitle("");
            rep.setTitleAddAutor("");
            rep.setTitleAddCreator("");
            rep.setTitleAddKeyWords("");
            rep.setTitleAddSubject("");
            rep.setTitleAddTitle("");
            rep.setTitleIntroDetails("");
            rep.setTitleReportBy("");
            rep.setTitleSecondDetails("");
            rep.setTitleThirdDetails("");
            rep.setTitleThirdTitle("");
            rep.setTitleTitle("");

            File file = new File("src/main/java/context/Report.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(ReportConfiguration.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            // output pretty printed
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            jaxbMarshaller.marshal(rep, file);
            jaxbMarshaller.marshal(rep, System.out);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        generateConfiguration();
    }

}
