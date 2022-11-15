package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Tonna/SA FR34K
 */
/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y 
Revolver*/
public class Juego {

    public ArrayList<Juego> jugadores1 = new ArrayList();
    private Boolean revolver;

    public Juego() {
    }

    public Juego(ArrayList<Juego> jugadores1, Boolean revolver) {
        this.jugadores1 = new ArrayList<>();
        this.revolver = revolver;
    }

    public ArrayList<Juego> getJugadores() {
        return jugadores1;
    }

    public void setJugadores(ArrayList<Juego> jugadores) {
        this.jugadores1 = jugadores;
    }

    public Boolean getRevolver() {
        return revolver;
    }

    public void setRevolver(Boolean revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores1 + ", revolver=" + revolver + '}';
    }

}
