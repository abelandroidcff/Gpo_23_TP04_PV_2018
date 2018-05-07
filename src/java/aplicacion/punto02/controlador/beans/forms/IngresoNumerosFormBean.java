
package aplicacion.punto02.controlador.beans.forms;

import aplicacion.punto02.modelo.domiinio.Numero;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class IngresoNumerosFormBean implements Serializable{
    private Numero numero;
    private List<Numero> numeros; 

        
    public IngresoNumerosFormBean() {
        numero = new Numero();
        numeros = new ArrayList<>();
    }
 // Guardar los numeros en el ArrayList   
public void agregarNumero(){
    getNumeros().add(getNumero());
    numero = new Numero();
}  

//Operaciones
public double obtenerMenor(){
    double menor=0.0;
    if (!numeros.isEmpty()) {
        menor = numeros.get(0).getNumero();
        for (int i=1; i < numeros.size(); i++){
            if (numeros.get(i).getNumero() < menor) {
                menor = numeros.get(i).getNumero();
            }
        }
    }
    return menor;
}

public double obtenerMayor(){
    double mayor=0.0;
    if (!numeros.isEmpty()) {
        mayor = numeros.get(0).getNumero();
        for (int i=1; i < numeros.size(); i++){
            if (numeros.get(i).getNumero() > mayor) {
                mayor = numeros.get(i).getNumero();
            }
        }
    }
   return mayor;
}

public double obtenerPromedio(){
    double suma = 0.0;
     if (!numeros.isEmpty()) {
          for (int i=0; i < numeros.size(); i++){
              suma = suma + numeros.get(i).getNumero();
          }
     }
    return (suma/numeros.size());
}

public void calculos(){
    obtenerMenor();
obtenerMayor();
        obtenerPromedio();
}

    /**
     * @return the numero
     */
    public Numero getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    /**
     * @return the numeros
     */
    public List<Numero> getNumeros() {
        return numeros;
    }

    /**
     * @param numeros the numeros to set
     */
    public void setNumeros(List<Numero> numeros) {
        this.numeros = numeros;
    }

}
