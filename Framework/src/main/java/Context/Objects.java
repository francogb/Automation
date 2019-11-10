/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Context;

import java.util.HashMap;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Franco.Garcia
 */

@XmlRootElement
public class Objects {
    //Identificador de la prueba
    private String nombreDeLaPrueba;
    
    private String tipoDePrueba;
    private String prioridad;
    private String referencia;
    private String asignada;
    private String tiempoInicio;
    private String tiempoFinal;
    private String estado;
    private String sprint;
    private String version;
    private Adulto adulto;
    private HashMap<String, String> pasos= new HashMap<>();

    public Objects() {
    }

    public Objects(String nombreDeLaPrueba, String tipoDePrueba, String prioridad, String referencia, String asignada, String tiempoInicio, String tiempoFinal, String estado, String sprint, String version, Adulto adulto, HashMap<String, String> step ) {
        this.nombreDeLaPrueba = nombreDeLaPrueba;
        this.tipoDePrueba = tipoDePrueba;
        this.prioridad = prioridad;
        this.referencia = referencia;
        this.asignada = asignada;
        this.tiempoInicio = tiempoInicio;
        this.tiempoFinal = tiempoFinal;
        this.estado = estado;
        this.sprint = sprint;
        this.version = version;
        this.adulto = adulto;
        this.pasos= step;
    }

    public String getNombreDeLaPrueba() {
        return nombreDeLaPrueba;
    }
    @XmlElement
    public void setNombreDeLaPrueba(String nombreDeLaPrueba) {
        this.nombreDeLaPrueba = nombreDeLaPrueba;
    }

    public String getTipoDePrueba() {
        return tipoDePrueba;
    }
    @XmlElement
    public void setTipoDePrueba(String tipoDePrueba) {
        this.tipoDePrueba = tipoDePrueba;
    }

    public String getPrioridad() {
        return prioridad;
    }
    @XmlElement
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getReferencia() {
        return referencia;
    }
    @XmlElement
    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getAsignada() {
        return asignada;
    }
    @XmlElement
    public void setAsignada(String asignada) {
        this.asignada = asignada;
    }

    public String getTiempoInicio() {
        return tiempoInicio;
    }
    @XmlElement
    public void setTiempoInicio(String tiempoInicio) {
        this.tiempoInicio = tiempoInicio;
    }

    public String getTiempoFinal() {
        return tiempoFinal;
    }
    @XmlElement
    public void setTiempoFinal(String tiempoFinal) {
        this.tiempoFinal = tiempoFinal;
    }

    public String getEstado() {
        return estado;
    }
    @XmlElement
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getSprint() {
        return sprint;
    }
    @XmlElement
    public void setSprint(String sprint) {
        this.sprint = sprint;
    }

    public String getVersion() {
        return version;
    }
    @XmlElement
    public void setVersion(String version) {
        this.version = version;
    }

    public Adulto getAdulto() {
        return adulto;
    }
    @XmlElement
    public void setAdulto(Adulto adulto) {
        this.adulto = adulto;
    }

    public HashMap<String, String> getPasos() {
        return pasos;
    }
    @XmlElement
    public void setPasos(HashMap<String, String> pasos) {
        this.pasos = pasos;
    }
    
    
    
    
}
