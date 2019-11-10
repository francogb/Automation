/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helpers;


import com.google.common.io.Files;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author Franco.Garcia
 */
public class StepHelper {
     public static void takeScreenShot(WebDriver driver, String imageName){
        File directory = new File("C:/Imagenes");
        try {
            if (directory.isDirectory()) {
                File imagen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                Files.copy(imagen, new File(directory.getAbsolutePath() + "\\" + imageName + ".png"));
            } else {
                throw new IOException("ERROR: La ruta especificada no es un directorio");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
