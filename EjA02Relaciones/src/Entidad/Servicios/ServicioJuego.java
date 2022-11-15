package Entidad.Servicios;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.

• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego*/
public class ServicioJuego {

    ServicioRdA rda = new ServicioRdA();
    ServicioJugador sj = new ServicioJugador();

    public void Jugar() {
        sj.CantidadJugadores();
        sj.llenado();
        System.out.println("");
        System.out.println("Se procede a cargar el revolver...");
        System.out.println("Se procede a girar el tambor...");
        System.out.println("");
        rda.llenar();
        rda.Mostrar();
        System.out.println("");
        int a = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println(sj.jugadores.get(a) + " dispara...");
            if (rda.mojar()) {
                System.out.println("Disparo de Agua!!!");
                System.out.println("");
                System.out.println("Jugador{" + "ide=" + sj.jugadores.get(a).getIde() + ", nombre=" + sj.jugadores.get(a).getNombre() + ", estado=mojado" + '}');
                System.out.println("");
                break;
            }
            if (!rda.mojar()) {
                System.out.println("Disparo de Aire...");
                rda.d1.setPoscactualtambor(rda.d1.getPoscactualtambor() + 1);
                System.out.println("");
            }
            a++;
            if (a >= sj.jugadores.size()) {
                a = 0;
            }
            if (i == 6) {
                i = 0;
            }
        }
    }
}
