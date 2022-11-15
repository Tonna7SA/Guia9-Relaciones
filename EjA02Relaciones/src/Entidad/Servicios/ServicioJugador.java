package Entidad.Servicios;

import Entidad.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/*El número de jugadores será decidido por el usuario, pero 
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6. 
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
public class ServicioJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Jugador j1 = new Jugador();
    int cantidad = 0;
    int i = 1;
    ArrayList<Jugador> jugadores = new ArrayList();

    public void CantidadJugadores() {
        System.out.println("Juego Ruleta Rusa de Agua");
        System.out.println("-------------------------");
        System.out.println("Ingrese la cantidad de jugadores... (1 - 6)");
        cantidad = leer.nextInt();
        if (!(cantidad > 0 && cantidad < 6)) {
            System.out.println("Cantidad invalida... se tomara como cantidad a 6 jugadores...");
            cantidad = 6;
        }
    }

    public Jugador jugadores() {

        System.out.println("Ingrese el nombre del Jugador N° " + i);
        j1.setIde(i);
        j1.setNombre(leer.next());
        j1.setEstado("Seco");

        return new Jugador(j1.getIde(), j1.getNombre(), j1.getEstado());
    }

    public void llenado() {
        jugadores = new ArrayList();
        for (int j = 0; j < cantidad; j++) {
            jugadores.add(jugadores());
            i++;
        }
        System.out.println("");
        for (Jugador aux : jugadores) {
            System.out.println(aux);
        }
    }

}
