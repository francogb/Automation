/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base;

import static Base.DriverContext.getDriver;
import Config.DataSetter;

/**
 *
 * @author Franco.Garcia
 */
public class BaseStep extends Base{
    
    public static void navigateToSite(){
        getDriver().navigate().to(DataSetter.configuration.getSut());
    }
    
    public static void navigateToServer01(){
        getDriver().navigate().to(DataSetter.configuration.getSut01());
    }
    
    public static void navigateToServer02(){
        getDriver().navigate().to(DataSetter.configuration.getSut02());
    }
    public static void navigateToServer03(){
        getDriver().navigate().to(DataSetter.configuration.getSut03());
    }
    public static void navigateToServer04(){
        getDriver().navigate().to(DataSetter.configuration.getSut04());
    }
    public static void navigateToServer05(){
        getDriver().navigate().to(DataSetter.configuration.getSut05());
    }
}
