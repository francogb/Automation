/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import org.openqa.selenium.WebDriver;

/**
 *
 * @author Franco.Garcia
 */
public class DriverContext {
    private static WebDriver driver;
    private static Browser browser;
    
    public static WebDriver getDriver(){
    return driver;
    }

    public static void setDriver(WebDriver driver) {
       DriverContext.driver = driver;
    }

    public static void setBrowser(Browser browser) {
        DriverContext.browser = browser;
    }

    public static Browser getBrowser() {
        return browser;
    }
}
