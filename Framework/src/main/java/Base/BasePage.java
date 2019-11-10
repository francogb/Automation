/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



/**
 *
 * @author Franco.Garcia
 */

public class BasePage extends Base{
    public static WebDriverWait wait= new WebDriverWait(DriverContext.getDriver(), 10);
    public static Actions actions = new Actions(DriverContext.getDriver());
    public static WebDriver driver = DriverContext.getDriver();
    public static Select select;
    
    public <TPage extends BasePage> TPage As(Class<TPage> pageInstance){
        try{
            return (TPage) this;
        }catch(Exception ex){
            ex.getStackTrace();
        }
        return null;
    }
    
}
