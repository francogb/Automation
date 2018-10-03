/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steps;

import Base.BaseStep;
import Log.Log;
import Pages.Home;

/**
 *
 * @author Franco.Garcia
 */
public class Cotizar extends BaseStep{
    
    public static void Run(){
        Log.startTestCase("Entra a la pagina");
        navigateToSite();
        Home home = new Home();
        currentPage = home.getInstance(Home.class);
        currentPage.As(Home.class).seleccionarDestino();
        currentPage.As(Home.class).selectStartDate();
        currentPage.As(Home.class).selectEndDate();
        currentPage.As(Home.class).seleccionarPax(1, 0, 0);
        currentPage.As(Home.class).clickQuote();
        
        
    }
}
