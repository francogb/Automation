/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Config;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Franco.Garcia
 */
@XmlRootElement
public class Configuration {

    private String browser;
    private String sut;
    private String sut01;
    private String sut02;
    private String sut03;
    private String sut04;
    private String sut05;
    private String isReportXlms;
    private String isReportPdf;
    private String isSuite;
    private String chromeDriverPath;
    private String log4ConfiguratorPath;
    private String isLog;
    private String isEmailDelivery;
    private String deliveryPath;

    public Configuration() {
    }

    public Configuration(String browser, String sut, String sut01, String sut02, String sut03, String sut04, String sut05, String isReportXlms, String isReportPdf, String isSuite, String chromeDriverPath, String log4ConfiguratorPath, String isLog, String isEmailDelivery, String deliveryPath) {
        this.browser = browser;
        this.sut = sut;
        this.sut01 = sut01;
        this.sut02 = sut02;
        this.sut03 = sut03;
        this.sut04 = sut04;
        this.sut05 = sut05;
        this.isReportXlms = isReportXlms;
        this.isReportPdf = isReportPdf;
        this.isSuite = isSuite;
        this.chromeDriverPath = chromeDriverPath;
        this.log4ConfiguratorPath = log4ConfiguratorPath;
        this.isLog = isLog;
        this.isEmailDelivery = isEmailDelivery;
        this.deliveryPath = deliveryPath;
    }

    public String getSut01() {
        return sut01;
    }

    @XmlElement
    public void setSut01(String sut01) {
        this.sut01 = sut01;
    }

    public String getSut02() {
        return sut02;
    }

    @XmlElement
    public void setSut02(String sut02) {
        this.sut02 = sut02;
    }

    public String getSut03() {
        return sut03;
    }

    @XmlElement
    public void setSut03(String sut03) {
        this.sut03 = sut03;
    }

    public String getSut04() {
        return sut04;
    }

    @XmlElement
    public void setSut04(String sut04) {
        this.sut04 = sut04;
    }

    public String getSut05() {
        return sut05;
    }

    @XmlElement
    public void setSut05(String sut05) {
        this.sut05 = sut05;
    }

    public String getBrowser() {
        return browser;
    }

    @XmlElement
    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getSut() {
        return sut;
    }

    @XmlElement
    public void setSut(String sut) {
        this.sut = sut;
    }

    public String getIsReportXlms() {
        return isReportXlms;
    }

    @XmlElement
    public void setIsReportXlms(String isReportXlms) {
        this.isReportXlms = isReportXlms;
    }

    public String getIsReportPdf() {
        return isReportPdf;
    }

    @XmlElement
    public void setIsReportPdf(String isReportPdf) {
        this.isReportPdf = isReportPdf;
    }

    public String getIsSuite() {
        return isSuite;
    }

    @XmlElement
    public void setIsSuite(String isSuite) {
        this.isSuite = isSuite;
    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    @XmlElement
    public void setChromeDriverPath(String chromeDriverPath) {
        this.chromeDriverPath = chromeDriverPath;
    }

    public String getLog4ConfiguratorPath() {
        return log4ConfiguratorPath;
    }

    @XmlElement
    public void setLog4ConfiguratorPath(String log4ConfiguratorPath) {
        this.log4ConfiguratorPath = log4ConfiguratorPath;
    }

    public String getIsLog() {
        return isLog;
    }

    @XmlElement
    public void setIsLog(String isLog) {
        this.isLog = isLog;
    }

    public String getIsEmailDelivery() {
        return isEmailDelivery;
    }

    @XmlElement
    public void setIsEmailDelivery(String isEmailDelivery) {
        this.isEmailDelivery = isEmailDelivery;
    }

    public String getDeliveryPath() {
        return deliveryPath;
    }

    @XmlElement
    public void setDeliveryPath(String deliveryPath) {
        this.deliveryPath = deliveryPath;
    }

}
