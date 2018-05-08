package aplicacion.punto04.controlador.beans.forms;

import aplicacion.punto04.modelo.dominio.JuegoAhorcado;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class JuegoAhorcadoBean implements Serializable {

    private JuegoAhorcado juegoAhorcado;

    public JuegoAhorcadoBean() {
        juegoAhorcado = new JuegoAhorcado();
    }

    public JuegoAhorcado getJuegoAhorcado() {
        return juegoAhorcado;
    }

    public void setJuegoAhorcado(JuegoAhorcado juegoAhorcado) {
        this.juegoAhorcado = juegoAhorcado;
    }
}
