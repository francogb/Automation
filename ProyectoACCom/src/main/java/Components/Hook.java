/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import Initializer.InitializerHook;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Franco.Garcia
 */
public class Hook extends InitializerHook{
    @BeforeClass
    public static void setUpClass(){
        openLogger();
    }
    
    @Before
    public void setUp(){
        openBrowser();
    }
    
    @After
    public void tearDown(){
        closeBrowser();
    }
    
    @AfterClass
    public static void tearDownClass(){
        
    }
    
    
}
