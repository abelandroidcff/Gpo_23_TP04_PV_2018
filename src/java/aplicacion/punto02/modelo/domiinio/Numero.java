package aplicacion.punto02.modelo.domiinio;

import java.io.Serializable;

public class Numero implements Serializable {

    private double numero;

    public Numero() {
    }

    public Numero(double numero) {
        this.numero = numero;
    }

    /**
     * @return the numero
     */
    public double getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }
}
