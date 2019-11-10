/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log;

import Config.DataSetter;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

/**
 *
 * @author Franco.Garcia
 */
public class Log {

    private static Logger logger = Logger.getLogger(Log.class.getName());

    public static void initializedLogger() {
        DOMConfigurator.configure(DataSetter.configuration.getLog4ConfiguratorPath());
    }

    public static void succesStep(String step) {
        try {
            String status = "Pass";
            Helpers.XMLHelper.object.getPasos().put(step, status);
            logger.info(step + ": " + status);
        } catch (Exception ex) {
            //
        }

    }

    public static void failStep(String step) {
        try {
            String status = "Fail";
            Helpers.XMLHelper.object.getPasos().put(step, status);
            logger.info(step + ": " + status);
        } catch (Exception ex) {
            //
        }

    }

    public static void startTestCase(String sTestCaseName) {
        try {
            logger.info("Start test: " + sTestCaseName);
        } catch (Exception ex) {
            //
        }
    }

    public static void endTestCase(String sTestCaseName) {
        try {
            logger.info("End test: " + sTestCaseName +"\r\n");
        } catch (Exception ex) {
            //
        }
    }
    
    public static void info(String message){
        logger.info(message);
    }
    
    public static void warn(String message){
        logger.info(message);
    }
    public static void debug(String message){
        logger.info(message);
    }
    
    public static void closeLogger() {
        logger = null;
    }
}
