/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import Base.BasePage;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author Franco.Garcia
 */
public class Home extends BasePage {

    @FindBy(id = "IdDestination")
    private static WebElement destino;

    @FindBy(xpath = "//*[@id=\"txtStartDate\"]")
    private static WebElement datePickerStart;

    @FindBy(xpath = "//*[@id=\"txtEndDate\"]")
    private static WebElement datePickerEnd;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody")
    private static WebElement datePickerTableStart;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody")
    private static WebElement datePickerTableStart2;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody")
    private static WebElement datePickerTableEnd;

    @FindBy(xpath = "//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody")
    private static WebElement datePickerTableEnd2;

    @FindBy(xpath = "//*[@id=\"ddlAdultos\"]")
    private static WebElement adult;

    @FindBy(xpath = "//*[@id=\"ddlMenores\"]")
    private static WebElement minor;

    @FindBy(xpath = "//*[@id=\"ddlMayores\"]")
    private static WebElement mayor;
    
    @FindBy(xpath = "//*[@id=\"frmQuoter\"]/button")
    private static WebElement quote;

    public static WebElement getQuote() {
        return quote;
    }

    public static WebElement getAdult() {
        return adult;
    }

    public static WebElement getMinor() {
        return minor;
    }

    public static WebElement getMayor() {
        return mayor;
    }

    public static WebElement getDestino() {
        return destino;
    }

    public static WebElement getDatePickerStart() {

        return datePickerStart;
    }

    public static WebElement getDatePickerEnd() {
        return datePickerEnd;
    }

    public static WebElement getDatePickerTableStart() {
        return datePickerTableStart;
    }

    public static WebElement getDatePickerTableStart2() {
        return datePickerTableStart2;
    }

    public static WebElement getDatePickerTableEnd() {
        return datePickerTableEnd;
    }

    public static WebElement getDatePickerTableEnd2() {
        return datePickerTableEnd2;
    }

    //Accion 1
    public void seleccionarDestino() {
        WebElement miDestino = getDestino();
        Select destination = new Select(miDestino);
        miDestino.click();

        destination.selectByVisibleText("Norte América");

    }

    //Accion 2
    int fechaPFin = -6;

    public void selectStartDate() {
        getDatePickerStart().click();
        Calendar fecha = new GregorianCalendar();
        int hoy = fecha.get(Calendar.DAY_OF_MONTH);
        int fechaAElegir = (hoy + 7);
        String fechaAElegirStr = String.valueOf(fechaAElegir);
        int fechaAElegir2 = 7;

        String fechaAElegir2Str = String.valueOf(fechaAElegir2);
        List<WebElement> columns = getDatePickerTableStart().findElements(By.tagName("td"));
        List<WebElement> columns2 = getDatePickerTableStart2().findElements(By.tagName("td"));

        if (fechaAElegir < 30) {
            for (WebElement cell : columns) {

                if (cell.getText().equals(fechaAElegirStr)) {

                    cell.click();
                    fechaPFin = fechaAElegir;
                    break;
                }
            }
        } else {

            for (WebElement cell2 : columns2) {

                if (cell2.getText().equals(fechaAElegir2Str)) {

                    cell2.click();
                    fechaPFin = fechaAElegir2;
                    break;
                }

            }

        }

    }

    //Accion 3
    public void selectEndDate() {
        getDatePickerEnd().click();
        int fechaAElegir = fechaPFin + 7;
        String fechaAElegirStr = String.valueOf(fechaAElegir);
        int fechaAElegir2 = 7;
        String fechaAElegir2Str = String.valueOf(fechaAElegir2);
        List<WebElement> columns = getDatePickerTableEnd().findElements(By.tagName("td"));
        List<WebElement> columns2 = getDatePickerTableEnd2().findElements(By.tagName("td"));

        if (fechaAElegir < 30) {
            for (WebElement cell : columns) {

                if (cell.getText().equals(fechaAElegirStr)) {

                    cell.click();
                    break;
                }
            }
        } else {

            for (WebElement cell2 : columns2) {

                if (cell2.getText().equals(fechaAElegir2Str)) {

                    cell2.click();
                    break;
                }

            }

        }

    }
    
    //Accion 4
    public void seleccionarPax(int adult, int minor, int mayor) {
        WebElement adulto = getAdult();
        WebElement menor = getMinor();
        WebElement old = getMayor();

        Select selAdulto = new Select(adulto);
        adulto.click();
        selAdulto.selectByVisibleText(String.valueOf(adult));

        Select selMenor = new Select(menor);
        menor.click();
        selMenor.selectByVisibleText(String.valueOf(minor));

        Select selOld = new Select(old);
        old.click();
        selOld.selectByVisibleText(String.valueOf(mayor));

    }
    
    //Accion 5
    public void clickQuote(){
        getQuote().click();
    }
//Keyword cotizar
//
//    public void realizarCotización() {
//        seleccionarDestino();
//        selectStartDate();
//        selectEndDate();
//    }
}
