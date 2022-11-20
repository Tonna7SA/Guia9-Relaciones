
package Entidad;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Adopcion {
private ArrayList<Perro> pichos;
private ArrayList<Persona> individuos;
private HashMap<Persona, Perro> adoptado;


    public Adopcion() {
    }

    public Adopcion(ArrayList<Perro> pichos, ArrayList<Persona> individuos, HashMap<Persona, Perro> adoptado) {
        this.pichos = pichos;
        this.individuos = individuos;
        this.adoptado = adoptado;
    }

    public HashMap<Persona, Perro> getAdoptado() {
        return adoptado;
    }

    public void setAdoptado(HashMap<Persona, Perro> adoptado) {
        this.adoptado = adoptado;
    }


    public ArrayList<Perro> getPichos() {
        return pichos;
    }

    public void setPichos(ArrayList<Perro> pichos) {
        this.pichos = pichos;
    }

    public ArrayList<Persona> getIndividuos() {
        return individuos;
    }

    public void setIndividuos(ArrayList<Persona> individuos) {
        this.individuos = individuos;
    }

    @Override
    public String toString() {
        return "Adopcion{" + "pichos=" + pichos + ", individuos=" + individuos + ", adoptado=" + adoptado + '}';
    }

}
