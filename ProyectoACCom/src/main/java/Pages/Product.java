/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import Base.BasePage;
import static Base.BasePage.wait;
import javax.xml.xpath.XPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author Franco.Garcia
 */
public class Product extends BasePage{
    @FindBy(css = "#id1 > button")
    private static WebElement addUpgrade;
    
    @FindBy (css="body > section > div.container > div > div > div > div.col-xs-12.col-sm-6.col-md-5.col-lg-4 > div > a")
    private static WebElement nextButton;
    
    public static WebElement getAddUpgrade(){
        wait.until(ExpectedConditions.elementToBeClickable(addUpgrade));
        return addUpgrade;
    }
    
    private static WebElement getNextButton(){
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        return nextButton;
    }
    
     public void clickAddOn(){
        getAddUpgrade().click();
    }
     public void clickNextButton(){
         getNextButton().click();
     }
     
    
    
}
