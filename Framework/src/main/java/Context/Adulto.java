/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Franco.Garcia
 */
@XmlRootElement
public class Adulto {
    private String nombre;
    private String apellido;
    private String dia;
    private String mes;
    private String anio;
    private String email;
    private String telefono;
    
    public Adulto(){}
    
    public Adulto(String nombre, String apellido, String dia, String mes, String anio, String email, String telefono) {
        this.nombre= nombre;
        this.apellido = apellido;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
    @XmlElement
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public  String getApellido() {
        return apellido;
    }
    @XmlElement
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDia() {
        return dia;
    }
    @XmlElement
    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }
    @XmlElement
    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAnio() {
        return anio;
    }
    @XmlElement
    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getEmail() {
        return email;
    }
    @XmlElement
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }
    @XmlElement
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
}
