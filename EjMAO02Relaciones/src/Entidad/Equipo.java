
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Equipo {
private ArrayList<Jugador> jugadores;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" + "jugadores=" + jugadores + '}';
    }

}
