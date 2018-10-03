/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 *
 * @author Franco.Garcia
 */
public class Product {
    @FindBy(xpath = "/html/body/section/div/div[1]/ul/li[1]/div[3]/a")
    private static WebElement addUpgrade;
}
