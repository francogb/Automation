/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class Prueba1 extends Hook{
    
   
     @Test
     public void prueba01() {
         Cotizar.Run();
         SeleccionarProducto.Run();
         
     }
}
