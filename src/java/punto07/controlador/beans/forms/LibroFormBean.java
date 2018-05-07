/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto07.controlador.beans.forms;

import punto07.controlador.bean.LibroBean;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

/**
 * Programación Visual - APU
 * @author Ariel Mamaní - LU3051 - Grupo 23
 */
@ManagedBean
@RequestScoped
public class LibroFormBean {
    
    @ManagedProperty ( value ="#{libroBean}" )
    private LibroBean libroBean;
    private List<LibroBean> libros;
    
    /**
     * Creates a new instance of PersonaFormBean
     */
    public LibroFormBean() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(LibroBean unLibro){        
        this.libros.add(unLibro);
    }
    
    public LibroBean getLibroBean() {
        return libroBean;
    }

    public void setLibroBean(LibroBean libroBean) {
        this.libroBean = libroBean;
    }
    
}
