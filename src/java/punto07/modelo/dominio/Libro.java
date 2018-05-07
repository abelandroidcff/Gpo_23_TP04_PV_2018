/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto07.modelo.dominio;

import java.io.Serializable;

/**
 * Programación Visual - APU
 * @author Ariel Mamaní - LU3051 - Grupo 23
 */
public class Libro implements Serializable{

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }
    private int isbn;
    private String titulo;
    private String autor;
    private double precio;    
    private int paisNacimiento;    

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, double precio) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn +
                " Titulo: " + titulo + 
                " Precio: " + precio;
    }

    public int getPaisNacimiento() {
        return paisNacimiento;
    }

    public void setPaisNacimiento(int paisNacimiento) {
        this.paisNacimiento = paisNacimiento;
    }
    
}
