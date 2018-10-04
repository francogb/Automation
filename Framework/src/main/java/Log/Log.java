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
    public static void initializedLogger(){
        DOMConfigurator.configure(DataSetter.configuration.getLog4ConfiguratorPath());
    }
    public static void startTestCase(String sTestCaseName){
        logger.info("start test: " + sTestCaseName);
    }
}
