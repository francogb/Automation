/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Delivery;

import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Franco.Garcia
 */
@XmlRootElement
public class EmailSenderConfiguration {
    private List<String> emailGroup;
    private String emailFrom;
    private String emailAuth;
    private String emailStarttls;
    private String smtpHost;
    private String port;
    private String user;
    private String password;
    private List<String> attachedFilesPath;

    public EmailSenderConfiguration() {
    }

    public EmailSenderConfiguration(List<String> emailGroup, String emailFrom, String emailAuth, String emailStarttls, String smtpHost, String port, String user, String password, List<String> attachedFilesPath) {
        this.emailGroup = emailGroup;
        this.emailFrom = emailFrom;
        this.emailAuth = emailAuth;
        this.emailStarttls = emailStarttls;
        this.smtpHost = smtpHost;
        this.port = port;
        this.user = user;
        this.password = password;
        this.attachedFilesPath = attachedFilesPath;
    }

    public String getUser() {
        return user;
    }
    @XmlElement
    public void setUser(String user) {
        this.user = user;
    }
    
    public List<String> getEmailGroup() {
        return emailGroup;
    }
    @XmlElement
    public void setEmailGroup(List<String> emailGroup) {
        this.emailGroup = emailGroup;
    }

    public String getEmailFrom() {
        return emailFrom;
    }
    @XmlElement
    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }
    
    public String getEmailAuth() {
        return emailAuth;
    }
    @XmlElement
    public void setEmailAuth(String emailAuth) {
        this.emailAuth = emailAuth;
    }

    public String getEmailStarttls() {
        return emailStarttls;
    }
    @XmlElement
    public void setEmailStarttls(String emailStarttls) {
        this.emailStarttls = emailStarttls;
    }

    public String getSmtpHost() {
        return smtpHost;
    }
    @XmlElement
    public void setSmtpHost(String smtpHost) {
        this.smtpHost = smtpHost;
    }

    public String getPort() {
        return port;
    }
    @XmlElement
    public void setPort(String port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }
    @XmlElement
    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getAttachedFilesPath() {
        return attachedFilesPath;
    }
    @XmlElement
    public void setAttachedFilesPath(List<String> attachedFilesPath) {
        this.attachedFilesPath = attachedFilesPath;
    }
    
    
}
