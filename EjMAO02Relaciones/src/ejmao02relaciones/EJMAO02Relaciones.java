package ejmao02relaciones;

import Entidad.Equipo;
import Entidad.Jugador;
import java.util.ArrayList;

/**
 *
 * @author Tonna/SA FR34K
*
 */

/*EJERCICIO JUGADOR
Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición 
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho 
esto, desde el main recorreremos el equipo mostrando la información de cada jugador.*/
public class EJMAO02Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Jugador d1 = new Jugador("Gonzalo","Barrasa","Delantero",9);
        Jugador d2 = new Jugador("Oscar","Cordoba","Arquero",1);
        Jugador d3 = new Jugador();
        d3.setNombre("Pedro");
        d3.setApellido("Picapiedra");
        d3.setPosicion("Defensor");
        d3.setNumero(3);
        
        ArrayList<Jugador> jugadores = new ArrayList();
        jugadores.add(d1);
        jugadores.add(d2);
        jugadores.add(d3);
        

        Equipo datos = new Equipo();
        datos.setJugadores(jugadores);
        System.out.println(jugadores.toString());
        
        
    }

}
