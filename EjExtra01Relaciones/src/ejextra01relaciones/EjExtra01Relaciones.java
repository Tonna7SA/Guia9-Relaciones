package ejextra01relaciones;

import Entidad.Adopcion;
import Entidad.Servicio.ServicioAdopcion;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 *
 */

/*1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/
public class EjExtra01Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ServicioAdopcion a1 = new ServicioAdopcion();

        int opcion;
        boolean a = false, b = false;
        do {
            System.out.println("Refugio de Perros");
            System.out.println("-----------------");
            System.out.println("1- Alta de Personas");
            System.out.println("2- Alta de Perros");
            System.out.println("3- Adopcion de Perros");
            System.out.println("4- Lista de Personas");
            System.out.println("5- Lista de Perros");
            System.out.println("6- Lista de Adopciones");
            System.out.println("7- Salir");
            System.out.println("Ingrese su opcion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    a1.Personas();
                    a = true;
                    System.out.println("");
                    continue;
                case 2:
                    a1.Perros();
                    b = true;
                    System.out.println("");
                    continue;
                case 3:
                    if (a && b) {
                        a1.Adopcion();
                    } else {
                        System.out.println("Listas vacias...");
                    }
                    System.out.println("");
                    continue;
                case 4:
                    if (a) {
                        a1.MostarPersonas();
                    } else {
                        System.out.println("Lista vacia...");
                    }
                    System.out.println("");
                    continue;
                case 5:
                    if (b) {
                        a1.MostrarPerros();
                    } else {
                        System.out.println("Lista vacia...");
                    }
                    System.out.println("");
                    continue;
                case 6:
                    a1.MostarAdopciones();
                    System.out.println("");
                    continue;
                case 7:
                    System.out.println("Programa Finalizado... Chau!!!");
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion Invalida, intente nuevamente...");
                    System.out.println("");
            }
        } while (opcion != 7);

    }

}
