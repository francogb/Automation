/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import Base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 *
 * @author Franco.Garcia
 */
public class Products extends BasePage {
    
    @FindBy(xpath = "/html/body/section/div/div[1]/ul/li[1]/h2")
    private static WebElement productName;
    
    @FindBy(xpath = "/html/body/section/div/div[1]/ul/li[1]/h3")
    private static WebElement productValueUsd;
    
    @FindBy(xpath = "/html/body/section/div/div[1]/ul/li[1]/h4")
    private static WebElement productValueOther;
    
    @FindBy(xpath = "/html/body/section/div/div[1]/ul/li[1]/div[1]/a")
    private static WebElement selectButton;
    
    @FindBy(xpath = "/html/body/section/div/div[1]/ul/li[1]/div[3]/a")
    private static WebElement productDetail;

    public static WebElement getProductName() {
        return productName;
    }
    
    

    public static WebElement getProductValueUsd() {
        return productValueUsd;
    }

    public static WebElement getProductValueOther() {
        return productValueOther;
    }

    public static WebElement getSelectButton() {
        wait.until(ExpectedConditions.elementToBeClickable(selectButton));
        return selectButton;
    }

    public static WebElement getProductDetail() {
        return productDetail;
    }
    
    public void selectProduct(){
        getSelectButton().click();
    }
    
}
