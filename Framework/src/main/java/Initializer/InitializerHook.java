/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initializer;

import Base.Base;
import Base.DriverContext;
import static Base.DriverContext.getDriver;
import Config.DataSetter;
import static Config.DataSetter.getConfiguration;
import Delivery.EmailSender;
import static Delivery.EmailSender.sendEmail;
import Helpers.XMLHelper;
import static Helpers.XMLHelper.guardarXml;
import static Helpers.XMLHelper.leerXml;
import Log.Log;
import static Log.Log.initializedLogger;
import Report.ReportConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;


/**
 *
 * @author Franco.Garcia
 */
public class InitializerHook extends Base {

    public InitializerHook() {
    }

    public static void openBrowser() {
        String browserType = DataSetter.configuration.getBrowser();
        switch (browserType) {

            case "Chrome": {
                System.setProperty("webdriver.chrome.driver", DataSetter.configuration.getChromeDriverPath());
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-maximized");
                options.addArguments("--disable-extensions");
                WebDriver driver = new ChromeDriver(options);
                DriverContext.setDriver(driver);
                break;
            }
            case "IExplorer": {
                WebDriver driver = new InternetExplorerDriver();
                DriverContext.setDriver(driver);
                break;
            }

        }
    }
    public static void closeBrowser(){
        getDriver().close();
        getDriver().quit();
        
    }
    
    public static void openLogger(){
        initializedLogger();
    }
    
    public static void closeLogger() {
        Log.closeLogger();
    }
    
    public static void closeConfiguration() {
        DataSetter.closeConfiguration();
    }
    
    public static void openConfiguration(){
        getConfiguration();
    }
    
    public static void openContextData(String testName){
        leerXml(testName);
    }
    
    public static void closeContextData(String testName){
        guardarXml(testName);
    }
    
    public static void openDelivery(){
        EmailSender.initializeEmailDeliveryConfiguration();
    }
    public static void closeDelivery() {
        sendEmail();
    }
    
    public static void openReport() {
        ReportConfiguration.getReportConfig();
    }

    public static void closeReport() {
        Report.Report.generatePdfReport();
    }
}
