/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

/**
 *
 * @author Franco.Garcia
 */
public class BaseStep extends Base{
    
    public static void navigateToSite(){
        DriverContext.getDriver().navigate().to("http://www.assistcard.com");
    }
}
