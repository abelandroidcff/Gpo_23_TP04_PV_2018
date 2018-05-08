package aplicacion.punto04.controlador.beans.forms;

import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@ViewScoped
public class JuegoAhorcadoFormBean implements Serializable {

    @ManagedProperty(value = "#{juegoAhorcadoBean}")
    private JuegoAhorcadoBean juegoAhorcadoBean;
    private boolean componenteDeshabilitado;
    private String palabraIngresada;
    private char letraIngresada;

    public JuegoAhorcadoFormBean() {
        componenteDeshabilitado = false;
    }

    public void controlarLetra() {
        boolean esLetraEncontrada = juegoAhorcadoBean.getJuegoAhorcado().buscarLetra(letraIngresada);
        if (esLetraEncontrada == true) {
            if (juegoAhorcadoBean.getJuegoAhorcado().juegoGanado() == true) {
                FacesContext context = FacesContext.getCurrentInstance();
                componenteDeshabilitado = false;
                palabraIngresada = new String();
                juegoAhorcadoBean.getJuegoAhorcado().reiniciarJuego();
                context.addMessage(null, new FacesMessage("¡¡¡GANASTE!!!"));
            }
        } else {
            if (juegoAhorcadoBean.getJuegoAhorcado().getIntentos() <= 0) {
                FacesContext context = FacesContext.getCurrentInstance();
                componenteDeshabilitado = false;
                palabraIngresada = new String();
                juegoAhorcadoBean.getJuegoAhorcado().reiniciarJuego();

                context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "PERDIO! :(", "PERDIO! :("));
            }
        }
    }

    public void empezarJuego() {
        juegoAhorcadoBean.getJuegoAhorcado().empezarJuego(palabraIngresada);
        componenteDeshabilitado = true;
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "INICIO DEL JUEGO", "INICIO DEL JUEGO"));
    }

    public JuegoAhorcadoBean getJuegoAhorcadoBean() {
        return juegoAhorcadoBean;
    }

    public void setJuegoAhorcadoBean(JuegoAhorcadoBean juegoAhorcadoBean) {
        this.juegoAhorcadoBean = juegoAhorcadoBean;
    }

    public String getPalabraIngresada() {
        return palabraIngresada;
    }

    public void setPalabraIngresada(String palabraIngresada) {
        this.palabraIngresada = palabraIngresada;
    }

    public char getLetraIngresada() {
        return letraIngresada;
    }

    public void setLetraIngresada(char letraIngresada) {
        this.letraIngresada = letraIngresada;
    }

    public boolean isComponenteDeshabilitado() {
        return componenteDeshabilitado;
    }

    public void setComponenteDeshabilitado(boolean componenteDeshabilitado) {
        this.componenteDeshabilitado = componenteDeshabilitado;
    }
}
