/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import Base.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

/**
 *
 * @author Franco.Garcia
 */
public class Pasajeros extends BasePage{


    @FindBy(css = "#txtName_1")
    private WebElement campoName;

    @FindBy(css = "#txtApellido_1")
    private WebElement campoLastName;
    
    @FindBy(css = "#ddlDocumentTypeP_1")
    private WebElement selectTipoDoc;
    
    @FindBy(css = "#txtNroDocumentoP_1")
    private WebElement campoDoc;

    @FindBy(css = "#emailP_1")
    private WebElement campoEmail;

    @FindBy(css = "#txtDias_1")
    private WebElement daysDate;

    @FindBy(css = "#ddlMeses_1")
    private WebElement monthDate;

    @FindBy(css = "#txtAnios_1")
    private WebElement yearDate;
    
    @FindBy(css = "#confemailP_1")
    private WebElement campoEmailConfirm;

    
    @FindBy(css = "#txtTelefono_1")
    private WebElement campoPhone;
    
    @FindBy(css = "#Tarjeta_1 > div.datos-creditcard > div:nth-child(3) > select")
    private WebElement SelectCard;
    
    @FindBy(css = "#Tarjeta_1 > div:nth-child(2) > div > select:nth-child(2)")
    private WebElement selectInstallments;
    
    @FindBy(css = "#txtNameCC_1")
    private WebElement campoName2;
    
    @FindBy(css = "#txtApellidoCC_1")
    private WebElement campoLastname2;

   
    
    @FindBy(css = "#ddlDocumentTypeCC_1")
    private WebElement selectTipoDoc2;
    
    @FindBy(css = "#txtNroDocumentoCC_1")
    private WebElement campoDoc2;
    
    @FindBy(css = "#chbConfirmLegals")
    private WebElement checkLegales;
    
    @FindBy(css = "#lnkContinue")
    private WebElement botonComprar;
    
    
    public void completarInfo() {

        
        getCampoName().sendKeys("Juan");
        getCampoLastName().sendKeys("Viajero");
        selectTipoDoc();
        getCampoDoc().sendKeys("33985295");
        insertarFecha();
        getCampoEmail().sendKeys("juan.viajero@assistcard.com");
        getCampoEmailConfirm().sendKeys("juan.viajero@assistcard.com");
        getCampoPhone().sendKeys("55552000");
        selectTarjeta();
        getCampoName2().sendKeys("Juan");
        getCampoLastname2().sendKeys("Viajero");
        selectTipoDoc2();
        getCampoDoc2().sendKeys("33985295");
        getCheckLegales().click();
        getBotonComprar().click();
        
//        checkTitle(title);
//        getCampoFirstName().sendKeys(firstName);
//        getCampoLastName().sendKeys(lastName);
//        getCampoEmail().sendKeys(Email);
//        getCampoPassword().sendKeys(Password);
//        getCampoPassword().sendKeys(Keys.ESCAPE);
//        insertarFecha(Day, Month, Year);
    }
    
    public void selectTipoDoc() {
        WebElement doc = getSelectTipoDoc();
        select = new Select(getSelectTipoDoc());
        doc.click();
        select.selectByVisibleText("DNI");
    }
    
        public void selectTipoDoc2() {
            WebElement doc2 = getSelectTipoDoc2();
            select = new Select(getSelectTipoDoc2());
            doc2.click();
            select.selectByVisibleText("DNI");
    }
    public void selectTarjeta() {
        WebElement tarjeta= getSelectCard();
        select = new Select(getSelectCard());
        tarjeta.click();
        
        select.selectByVisibleText("VISA");
    }
//    public void selectCuotas() {
//        select = new Select(getSelectInstallments());
//        select.selectByVisibleText("3 cuotas");
//    }


    public void insertarFecha() {
        
        WebElement month = getMonthDate();
        getDaysDate().sendKeys("27");

        select = new Select(getMonthDate());
        month.click();
        select.selectByValue("07");

        getYearDate().sendKeys("1989");
    }

    
public void setCampoName() {
    
    this.campoName = campoName;
    }

    public WebElement getCampoEmail() {
        //Wait.until(ExpectedConditions.elementToBeClickable(campoEmail));
        campoEmail.clear();
        return campoEmail;
    }



    public WebElement getCampoName() {
        wait.until(ExpectedConditions.elementToBeClickable(campoName));
        return campoName;
    }

    

    public WebElement getCampoLastName() {
        return campoLastName;
    }

    public void setCampoLastName(WebElement campoLastName) {
        this.campoLastName = campoLastName;
    }

    public WebElement getSelectTipoDoc() {
        return selectTipoDoc;
    }

    public void setSelectTipoDoc(WebElement selectTipoDoc) {
        this.selectTipoDoc = selectTipoDoc;
    }

    public WebElement getCampoDoc() {
        return campoDoc;
    }

    public void setCampoDoc(WebElement campoDoc) {
        this.campoDoc = campoDoc;
    }

//    public WebElement getCampoEmail() {
//        return campoEmail;
//    }

    public void setCampoEmail(WebElement campoEmail) {
        this.campoEmail = campoEmail;
    }

    public WebElement getDaysDate() {
        return daysDate;
    }

    public void setDaysDate(WebElement daysDate) {
        this.daysDate = daysDate;
    }

    public WebElement getMonthDate() {
        return monthDate;
    }

    public void setMonthDate(WebElement monthDate) {
        this.monthDate = monthDate;
    }

    public WebElement getYearDate() {
        return yearDate;
    }

    public void setYearDate(WebElement yearDate) {
        this.yearDate = yearDate;
    }

    public WebElement getCampoEmailConfirm() {
        return campoEmailConfirm;
    }

    public void setCampoEmailConfirm(WebElement campoEmailConfirm) {
        this.campoEmailConfirm = campoEmailConfirm;
    }

    public WebElement getCampoPhone() {
        return campoPhone;
    }

    public void setCampoPhone(WebElement campoPhone) {
        this.campoPhone = campoPhone;
    }

    public WebElement getSelectCard() {
        return SelectCard;
    }

    public void setSelectCard(WebElement SelectCard) {
        this.SelectCard = SelectCard;
    }

    public WebElement getSelectInstallments() {
        return selectInstallments;
    }

    public void setSelectInstallments(WebElement selectInstallments) {
        this.selectInstallments = selectInstallments;
    }

    public WebElement getCampoName2() {
        return campoName2;
    }

    public void setCampoName2(WebElement campoName2) {
        this.campoName2 = campoName2;
    }

    public WebElement getCampoLastname2() {
        return campoLastname2;
    }

    public void setCampoLastname2(WebElement campoLastname2) {
        this.campoLastname2 = campoLastname2;
    }

    public WebElement getSelectTipoDoc2() {
        return selectTipoDoc2;
    }

    public void setSelectTipoDoc2(WebElement selectTipoDoc2) {
        this.selectTipoDoc2 = selectTipoDoc2;
    }

    public WebElement getCampoDoc2() {
        return campoDoc2;
    }

    public void setCampoDoc2(WebElement campoDoc2) {
        this.campoDoc2 = campoDoc2;
    }

    public WebElement getCheckLegales() {
        return checkLegales;
    }

    public void setCheckLegales(WebElement checkLegales) {
        this.checkLegales = checkLegales;
    }

    public WebElement getBotonComprar() {
        return botonComprar;
    }

    public void setBotonComprar(WebElement botonComprar) {
        this.botonComprar = botonComprar;
    }

}
