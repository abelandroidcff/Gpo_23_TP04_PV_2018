
package aplicacion.punto01.controlador.beans.forms;

import aplicacion.punto01.modelo.dominio.ConversorTemperatura;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
public class ConversorTemperaturaFormBeans implements Serializable {
    private double n;
    private ConversorTemperatura conversorTemperatura= new ConversorTemperatura();
    private char unidadOrigen;
    private char unidadDestino;
    //constructor sin parametros
    public ConversorTemperaturaFormBeans() {
    }
    
//metodo para obtener la temperatura en la escala deseada
    public double convertirTemperaturas(){
        double resultado=.0;
        if(unidadOrigen=='C' && unidadDestino == 'F'){
            resultado=Math.round(conversorTemperatura.obtenerDeCelsiusAFahrenheit());
        }else if(unidadOrigen=='C' && unidadDestino == 'K'){
            resultado=conversorTemperatura.obtenerDeCelsiusAKelvin();
        }else if(unidadOrigen=='F' && unidadDestino == 'C'){
            resultado=Math.round(conversorTemperatura.obtenerDeFahrenheitACelsius());
        }else if(unidadOrigen=='F' && unidadDestino == 'K'){
            resultado=conversorTemperatura.obtenerDeFahrenheitAKelvin();
        }else if (unidadOrigen=='K' && unidadDestino == 'C'){
            resultado=conversorTemperatura.obtenerDeKelvinACelsius();
        }else if (unidadOrigen=='K' && unidadDestino == 'F'){
            resultado=conversorTemperatura.obtenerDeKelvinAFahrenheit();
        }else if (unidadOrigen=='C' && unidadDestino == 'C'){
            resultado=conversorTemperatura.getNumero();
        }
        return resultado;
    }

//se generan los getter & setter
    public double getN() {
        return n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public ConversorTemperatura getConversorTemperatura() {
        return conversorTemperatura;
    }

    public void setConversorTemperatura(ConversorTemperatura conversorTemperatura) {
        this.conversorTemperatura = conversorTemperatura;
    }

    public char getUnidadOrigen() {
        return unidadOrigen;
    }

    public void setUnidadOrigen(char unidadOrigen) {
        this.unidadOrigen = unidadOrigen;
    }

    public char getUnidadDestino() {
        return unidadDestino;
    }

    public void setUnidadDestino(char unidadDestino) {
        this.unidadDestino = unidadDestino;
    }
    
}
