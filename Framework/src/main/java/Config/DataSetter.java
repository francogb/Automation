/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Franco.Garcia
 */
public class DataSetter {
    
    public static Configuration configuration;
   
    public static void getConfiguration(){
        try {
            File file = new File("src/main/java/Configuration/ConfigurationFile.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Configuration.class);
            Unmarshaller jaxUnmarshaller = jaxbContext.createUnmarshaller();
            configuration = (Configuration) jaxUnmarshaller.unmarshal(file);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    
    }
    
    public static void closeConfiguration() {
        configuration = null;
    }
}
