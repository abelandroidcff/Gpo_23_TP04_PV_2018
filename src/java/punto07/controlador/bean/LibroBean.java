/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto07.controlador.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import punto07.modelo.dominio.Libro;

/**
 * Programación Visual - APU
 * @author Ariel Mamaní - LU3051 - Grupo 23
 */
@ManagedBean
@RequestScoped
public class LibroBean {
    private Libro libro;
    /**
     * Creates a new instance of PersonaBean
     */
    public LibroBean() {
        libro = new Libro();
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    
}
