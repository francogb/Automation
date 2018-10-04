/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Base.BaseStep;
import Components.Hook;
import Steps.Cotizar;
import Steps.SeleccionarProducto;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Franco.Garcia
 */
public class PruebaEnServers extends Hook{
    
   
     @Test
     public void server01() {
         BaseStep.navigateToServer01();
         Cotizar.Run();
         SeleccionarProducto.Run();
         
     }
     
     @Test
     public void server02() {
         BaseStep.navigateToServer02();
         Cotizar.Run();
         SeleccionarProducto.Run();
         
     }
     
     @Test
     public void server03() {
         BaseStep.navigateToServer03();
         Cotizar.Run();
         SeleccionarProducto.Run();
         
     }
     
     @Test
     public void server04() {
         BaseStep.navigateToServer04();
         Cotizar.Run();
         SeleccionarProducto.Run();
         
     }
     
     @Test
     public void server05() {
         BaseStep.navigateToServer05();
         Cotizar.Run();
         SeleccionarProducto.Run();
         
     }
     
    
}
