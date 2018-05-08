package aplicacion.punto03.modelo.dominio;

import java.io.Serializable;

public class Calculadora implements Serializable {

    public double sumar(double numeroA, double numeroB) {
        return numeroA + numeroB;
    }

    public double restar(double numeroA, double numeroB) {
        return numeroA - numeroB;
    }

    public double multiplicar(double numeroA, double numeroB) {
        return numeroA * numeroB;
    }

    public double dividir(double numeroA, double numeroB) {
        double resultado = 0;
        if (numeroB != 0) {
            resultado = numeroA / numeroB;
        }
        return resultado;
    }

    public double elevar(double numeroA, double numeroB) {
        double resultado = 1;
        if (numeroB != 0) {
            resultado = Math.pow(numeroA, numeroB);
        }
        return resultado;
    }
}
