/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;

import Context.Adulto;
import Context.ContextManager;
import static Context.ContextManager.putObject;
import Context.Objects;
import Context.PreObjects;
import Timers.Timers;
import static Timers.Timers.endTimer;
import static Timers.Timers.start;
import static Timers.Timers.startTimer;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author Franco.Garcia
 */
public class XMLHelper {

    public static Objects object;
    public static ArrayList<PreObjects> preObjects = new ArrayList<>();

    public static void leerXml(String testName) {
        try {
            File file = new File("src/main/java/Context/" + testName + ".xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Objects.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Objects obj= (Objects) jaxbUnmarshaller.unmarshal(file);
            object= obj;
            startTimer();
            object.setTiempoInicio(String.valueOf(start / 1000));
        } catch (Exception ex) {
            System.out.println("Paso algo leyendo el xml "+ ex.getMessage());
        }
    }

    public static void generarXml() {
        try {
            Adulto adult = new Adulto("nombre", "apellido", "dia", "mes", "anio", "email", "telefono");
            HashMap<String, String> hash= new HashMap<>();
            hash.put("Cotizar", "Pass");
            hash.put("Seleccionar Producto", "Pass");
            
            Objects objeto= new Objects("Prueba en Servers", "funcional", "alta", "ACI1234", "FrancoGB", "", "", "", "1", "1.0", adult, hash);
            
            File file = new File("src/main/java/Context/ObjectEjemplo.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Objects.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(objeto, file);
            //endTimer();
            //object.setTiempoFinal(Timers.getTimer());
            jaxbMarshaller.marshal(objeto, System.out);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static void guardarXml(String testName){
        try {
            File file = new File("src/main/java/Context/" + testName + ".xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Objects.class);
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.marshal(object, file);
            endTimer();
            object.setTiempoFinal(String.valueOf(Timers.getTimer()));
            putObject();
           
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {
        generarXml();
    }
}
