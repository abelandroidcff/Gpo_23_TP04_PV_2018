
package aplicacion.punto01.modelo.dominio;

import java.io.Serializable;


public class ConversorTemperatura implements Serializable{
    private double numero;
    
    //se declara un constructor sin parametros
    public ConversorTemperatura() {
    }
    //metodo para obtener grados Fahrenheit
    public double obtenerDeCelsiusAFahrenheit(){
        return (numero*1.8)+32;
    }
    //metodo para obtener grados Kelvin
    public double obtenerDeCelsiusAKelvin(){
        return numero+273.15;
    }
    //metodo para obtener grados Celsius
    public double obtenerDeFahrenheitACelsius(){
        return (numero-32)/1.8;
    }
    //metodo para obtener grados Kelvin
    public double obtenerDeFahrenheitAKelvin(){
        return (numero+459.67)/1.8;
    }
    //metodo para obtener grados Celsius
    public double obtenerDeKelvinACelsius(){
        return numero -273.15;
    }
    //metodo para obtener grados Fahrenheit
    public double obtenerDeKelvinAFahrenheit(){
        return (numero*1.8)-459.67;
    }
    //se generan los getter & setter de el atributo numero
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
}
