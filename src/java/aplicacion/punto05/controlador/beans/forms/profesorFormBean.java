
package aplicacion.punto05.controlador.beans.forms;


import aplicacion.punto05.modelo.dominio.Profesor;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class profesorFormBean implements Serializable {

    private List<Profesor> listaP;
    private Profesor profesor;
    private String opcionSexo;

    public profesorFormBean() {
        listaP = new ArrayList<>();
        profesor = new Profesor();
    }

    /**
     * @return the listaP
     */
    public List<Profesor> getListaP() {
        return listaP;
    }

    /**
     * @param listaP the listaP to set
     */
    public void setListaP(List<Profesor> listaP) {
        this.listaP = listaP;
    }

    /**
     * @return the profesor
     */
    public Profesor getProfesor() {
        return profesor;
    }

    /**
     * @param profesor the profesor to set
     */
    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    /**
     * @return the opcionSexo
     */
    public String getOpcionSexo() {
        return opcionSexo;
    }

    /**
     * @param opcionSexo the opcionSexo to set
     */
    public void setOpcionSexo(String opcionSexo) {
        this.opcionSexo = opcionSexo;
    }

//Metodo para la variable sexo
    public void sexoMF() {
        switch (opcionSexo) {
            case "F": {
                profesor.setSexo("Femenino");
                break;
            }
            case "M": {
                profesor.setSexo("Masculino");
                break;
            }
        }
    }

    public void guardarProfesores() {
        switch (opcionSexo) {
            case "F": {
                profesor.setSexo("Femenino");
                break;
            }
            case "M": {
                profesor.setSexo("Masculino");
                break;
            }
        }
        getListaP().add(profesor);
        profesor = new Profesor();
    }

}
