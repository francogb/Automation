/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Log;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;



/**
 *
 * @author Franco.Garcia
 */
public class Log {
    private static Logger logger = Logger.getLogger(Log.class.getName());
    public static void initialiedLogger(){
        DOMConfigurator.configure("src/log4j.xml");
    }
    public static void startTestCase(String sTestCaseName){
        logger.info("start test: " + sTestCaseName);
    }
}
