/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initializer;

import Base.Base;
import Base.DriverContext;
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
        switch ("Chrome") {

            case "Chrome": {
                System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
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
        DriverContext.getDriver().close();
    }
}
