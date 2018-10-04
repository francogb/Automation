/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Components;

import Initializer.InitializerHook;
import static Initializer.InitializerHook.openConfiguration;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;

/**
 *
 * @author Franco.Garcia
 */
public class Hook extends InitializerHook{
    @BeforeClass
    public static void setUpClass(){
        openConfiguration();
        openLogger();
    }
    
    @Before
    public void setUp(){
        openContextData(testName.getMethodName());
        openBrowser();
    }
    
    @After
    public void tearDown(){
        closeContextData(testName.getMethodName());
        closeBrowser();
    }
    
    @AfterClass
    public static void tearDownClass(){
        
    }
    
    @Rule
    public TestName testName = new TestName();
}
