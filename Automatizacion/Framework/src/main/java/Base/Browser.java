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
public class Browser {
    private WebDriver _driver;

    public Browser(WebDriver driver) {
        _driver = driver;
    }
    
    public enum browserType{
        Chrome,
        IExplorer,
        Firefox    
    }
    
    
}
