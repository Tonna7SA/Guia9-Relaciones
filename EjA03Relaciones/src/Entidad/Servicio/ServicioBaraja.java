package Entidad.Servicio;

import Entidad.Baraja;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioBaraja {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String Palos[] = {"Copa", "Oro", "Espada", "Basto"};
    LinkedList<Baraja> bar1 = new LinkedList();
    Baraja b1;

    public Baraja Mazo() {
        b1 = new Baraja();
        b1.bar = new LinkedList();

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 13; j++) {
                if (j != 8 && j != 9) {
                    b1.setPalo(Palos[i]);
                    b1.setNumerocarta(j);
                    Baraja a = new Baraja(b1.getPalo(), b1.getNumerocarta());
                    b1.bar.add(a);
                }
            }
        }
        return new Baraja();
    }

    public void Mezclar() {
        System.out.println("Mazo Barajado...");
        Collections.shuffle(b1.bar);
        for (Baraja aux : b1.bar) {
            System.out.println(aux);
        }
        System.out.println("");
    }

    public void MostrarMazo() {
        System.out.println("Mazo Mostrado");
        for (Baraja aux : b1.bar) {
            System.out.println(aux);
        }
        System.out.println(b1.bar.size());
        System.out.println("");
    }
    
    int orden = 0;

    public void SiguienteCarta() {
        if (orden >= b1.bar.size()) {
            System.out.println("No hay mas cartas para mostrar del mazo");
        } else {
            System.out.println("Mostrar siguiente carta");
            for (int i = orden; i < b1.bar.size(); i++) {
                if (orden > b1.bar.size()) {
                    System.out.println("No hay mas cartas para mostrar del mazo");
                    break;
                } else {
                    System.out.println(b1.bar.get(orden));
                    orden++;
                    break;
                }
            }
        }

    }

    public void DarCartas() {
        int cantidad = 0;
        int a = 0;
        System.out.println("Ingrese la cantidad de cartas a dar: ");
        cantidad = leer.nextInt();
        do {
            if (b1.bar.size() < cantidad) {
                System.out.println("En el maso no queda esa cantidad de cartas, solo quedan " + b1.bar.size() + " cartas");
                break;
            } else {
                bar1.add(b1.bar.getFirst());
                b1.bar.removeFirst();
                a++;
            }
        } while (cantidad != a);
    }

    public void MostarMano() {
        for (Baraja aux : bar1) {
            System.out.println(aux);
        }
        System.out.println(bar1.size());
    }

    public void Menu() {
        int opcion = 0;
        do {
            System.out.println("Menu de Opciones");
            System.out.println("1- Barajar");
            System.out.println("2- Siguiente Carta");
            System.out.println("3- Dar Cartas");
            System.out.println("4- Cartas Mano");
            System.out.println("5- Mostrar Mazo");
            System.out.println("6- Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    Mezclar();
                    continue;
                case 2:
                    SiguienteCarta();
                    continue;
                case 3:
                    DarCartas();
                    continue;
                case 4:
                    if (bar1.isEmpty()) {
                        System.out.println("Primero tendria que dar cartas...");
                    } else {
                        MostarMano();
                    }
                    continue;
                case 5:
                    if (b1.bar.isEmpty()) {
                        System.out.println("No quedan cartas en el mazo...");
                    } else {
                        MostrarMazo();
                    }
                    continue;
                case 6:
                    System.out.println("Programa Terminado... Chau!!!!");
                    break;
                default:
                    System.out.println("Esa no es una opcion valida");
                    continue;
            }
        } while (opcion != 6);
    }

}
