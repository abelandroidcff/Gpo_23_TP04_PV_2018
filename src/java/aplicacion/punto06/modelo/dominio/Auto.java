/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto06.modelo.dominio;

import java.io.Serializable;

/**
 *
 * @author abel
 */
public class Auto implements Serializable {
    private String patente;
    private String marca;
    private String modelo;
    private String color;
    private String tipoCombustible;
    //declaracion de constructor vacio
    public Auto() {
    }
    //declaracion de constructor con parametros
    public Auto(String patente, String marca, String modelo, String color, String tipoCombustible) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoCombustible = tipoCombustible;
    }
    //se generan los getter & setter de los atributos de la clase auto
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }
    

}


