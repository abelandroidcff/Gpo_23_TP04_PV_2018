/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.punto07.controlador.beans.forms;

import aplicacion.punto07.modelo.dominio.Libro;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 * Programación Visual - APU
 * @author Ariel Mamaní - LU3051 - Grupo 23
 */
@ManagedBean
@ViewScoped
public class LibroFormBean implements Serializable{
    
    //@ManagedProperty ( value ="#{libroBean}" )
    private Libro libroBean;
    private List<Libro> librosBean;
    private String libroABuscar;
    
    /**
     * Creates a new instance of PersonaFormBean
     */
    public LibroFormBean() {
        libroBean = new Libro();        
        librosBean = new ArrayList<>();
    }
            
    public void agregarLibro(){
        librosBean.add(libroBean);
        libroBean = new Libro();
    }

    public void buscarLibro(){
        List<Libro> librosAuxiliar = new ArrayList<>();
        for(Libro unLibro:librosBean){
            if(unLibro.getTitulo().equals(libroABuscar)){
                librosAuxiliar.add(unLibro);
            }
        }
        librosBean = librosAuxiliar;
    }
    
    /**
     * @return the libroBean
     */
    public Libro getLibroBean() {
        return libroBean;
    }

    /**
     * @param libroBean the libroBean to set
     */
    public void setLibroBean(Libro libroBean) {
        this.libroBean = libroBean;
    }

    /**
     * @return the librosBean
     */
    public List<Libro> getLibrosBean() {
        return librosBean;
    }

    /**
     * @param librosBean the librosBean to set
     */
    public void setLibrosBean(List<Libro> librosBean) {
        this.librosBean = librosBean;
    }

    /**
     * @return the libroABuscar
     */
    public String getLibroABuscar() {
        return libroABuscar;
    }

    /**
     * @param libroABuscar the libroABuscar to set
     */
    public void setLibroABuscar(String libroABuscar) {
        this.libroABuscar = libroABuscar;
    }
            
}
