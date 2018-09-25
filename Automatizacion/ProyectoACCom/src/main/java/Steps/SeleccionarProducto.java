/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steps;

import Base.BaseStep;
import Pages.Products;

/**
 *
 * @author Franco.Garcia
 */
public class SeleccionarProducto extends BaseStep{
    
    public static void Run(){
        
        Products products = new Products();
        currentPage = products.getInstance(Products.class);
        currentPage.As(Products.class).selectProduct();
    }
    
}
