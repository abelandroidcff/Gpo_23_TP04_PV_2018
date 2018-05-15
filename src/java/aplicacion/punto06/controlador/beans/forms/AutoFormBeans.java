
package aplicacion.punto06.controlador.beans.forms;

import aplicacion.punto06.modelo.dominio.Auto;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class AutoFormBeans implements Serializable {
    private Auto auto;
    private List<Auto> autos;
    private int dato;
   
    //declaracion del constructor

    public AutoFormBeans() {
    auto = new Auto();
    autos = new ArrayList<>();
    }
    //metodo para listar autos precargados 
    public void listarAuto(){
        Auto auto = new Auto(); 
        auto.setPatente("AB 123 CD");
        auto.setMarca("Peugeot");
        auto.setModelo("2008");
        auto.setColor("Negro Perla");
        auto.setTipoCombustible("Nafta");
        autos.add(auto);
        auto=new Auto();
        auto.setPatente("AB 145 XD");
        auto.setMarca("Renault");
        auto.setModelo("Oroch");
        auto.setColor("Rojo");
        auto.setTipoCombustible("Gasoil");
        autos.add(auto);
        auto=new Auto();
        auto.setPatente("AB 233 HY");
        auto.setMarca("Citroen");
        auto.setModelo("C3");
        auto.setColor("Gris");
        auto.setTipoCombustible("Nafta");
        autos.add(auto);
        auto=new Auto();
        auto.setPatente("AB 456 CG");
        auto.setMarca("Fiat");
        auto.setModelo("Toro");
        auto.setColor("Azul");
        auto.setTipoCombustible("Nafta");
        autos.add(auto);
        auto=new Auto();
        auto.setPatente("AB 173 FR");     
        auto.setMarca("Volkswagen");
        auto.setModelo("Nueva Saverio");
        auto.setColor("Rubi");
        auto.setTipoCombustible("Gasoil");
        autos.add(auto);  
    }
    //metodo usado con <p:dialog para poder editar la lista de autos precargada
    public void editarAuto(){
        int indice=dato-1;
        this.autos.add(indice, auto);      
    }
    
    //se generan los setter & getter
    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public List<Auto> getAutos() {
        return autos;
    }

    public void setAutos(List<Auto> autos) {
        this.autos = autos;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    
}
