/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import org.openqa.selenium.support.PageFactory;



/**
 *
 * @author Franco.Garcia
 */
public class Base {
    
    public static BasePage currentPage;
    public <TPage extends BasePage> TPage getInstance(Class<TPage> page){
        Object obj = PageFactory.initElements(DriverContext.getDriver(), page);
        return page.cast(obj);
    }
    
   
    
    
    
}
