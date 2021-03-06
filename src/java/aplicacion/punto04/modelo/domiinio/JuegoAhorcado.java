package aplicacion.punto04.modelo.dominio;

import java.io.Serializable;
import java.util.ArrayList;

public class JuegoAhorcado implements Serializable {

    private String palabraAdivinar;
    private String ayudaPalabra;
    private int intentos;
    private char[] palabraAhorcado;

    public JuegoAhorcado() {
        reiniciarJuego();
    }

    public void reiniciarJuego() {
        palabraAhorcado = new char[10];
        palabraAdivinar = "";
        intentos = 5;
    }

    public String getPalabraAdivinar() {
        return palabraAdivinar;
    }

    public void setPalabraAdivinar(String palabraAdivinar) {
        this.palabraAdivinar = palabraAdivinar;
    }

    public String getAyudaPalabra() {
        return ayudaPalabra;
    }

    public void setAyudaPalabra(String ayudaPalabra) {
        this.ayudaPalabra = ayudaPalabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public char[] getPalabraAhorcado() {
        return palabraAhorcado;
    }

    public ArrayList<String> getPalabraAhorcadoFormat() {
        ArrayList<String> caracteresPalabra = new ArrayList<>();
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            caracteresPalabra.add(String.valueOf(palabraAhorcado[i]));
        }
        return caracteresPalabra;
    }

    public void setPalabraAhorcado(char[] palabraAhorcado) {
        this.palabraAhorcado = palabraAhorcado;
    }

    public boolean ingresarLetra(char letra) {
        return false;

    }

    public void empezarJuego(String palabra) {
        palabraAdivinar = palabra;
    }

    public boolean buscarLetra(char letra) {
        boolean encontro = false;
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) == letra) {
                palabraAhorcado[i] = letra;
                encontro = true;
            }
        }
        if (encontro == false) {
            this.intentos = this.intentos - 1;
            return false;
        } else {
            return true;
        }
    }
    
    public boolean juegoGanado() {
        boolean ganador = true;
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            if (palabraAdivinar.charAt(i) != palabraAhorcado[i]) {
                ganador = false;
            }
        }
        return ganador;
    }
}
