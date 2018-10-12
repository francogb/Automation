/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steps;

import static Base.Base.currentPage;
import static Base.BasePage.driver;
import Base.BaseStep;
import static Base.DriverContext.getDriver;
import static Helpers.StepHelper.takeScreenShot;
import Log.Log;
import Pages.Home;
import Pages.Pasajeros;
import Pages.Product;
import Pages.Products;
import org.junit.rules.TestName;

/**
 *
 * @author Franco.Garcia
 */
public class Cotizar extends BaseStep{
    
    public static void Run(String testName){
        Log.startTestCase(testName);
        Log.succesStep("01. Ingresa al sitio");
        Home home = new Home();
        currentPage = home.getInstance(Home.class);
        currentPage.As(Home.class).seleccionarDestino();
        Log.succesStep("02. Selecciona destino");
        currentPage.As(Home.class).selectStartDate();
        Log.succesStep("03. Selecciona fecha de inicio");
        currentPage.As(Home.class).selectEndDate();
        Log.succesStep("04. Selecciona fecha de fin");
        currentPage.As(Home.class).seleccionarPax(1, 0, 0);
        Log.succesStep("05. Selecciona pasajero");
        currentPage.As(Home.class).clickQuote();
        Log.succesStep("06. Click en cotizar");
        takeScreenShot(getDriver(), "cotizar");
        
        Products products = new Products();
        currentPage = products.getInstance(Products.class);
        Log.succesStep("07. Ingresa a Products");
        currentPage.As(Products.class).selectProduct();
        Log.succesStep("08. Selecciona un producto");
        
        Product product = new Product();
        currentPage = product.getInstance(Product.class);
        Log.succesStep("09. Ingresa a Product");
        currentPage.As(Product.class).clickAddOn();
        Log.succesStep("10. Selecciona un AddOn");
        currentPage.As(Product.class).clickNextButton();
        Log.succesStep("11. Click en siguiente");
        
        
        Log.succesStep("12. Ingresa a Passengers");
        Pasajeros pasajero = new Pasajeros();
        currentPage = product.getInstance(Pasajeros.class);
        
        currentPage.As(Pasajeros.class).completarInfo();
        Log.succesStep("13. Carga los datos");
        Log.succesStep("14. Click en comprar");
        Log.endTestCase(testName);
        
    }
}
