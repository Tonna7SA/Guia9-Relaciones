package Entidad.Servicio;

import Entidad.Adopcion;
import Entidad.Perro;
import Entidad.Persona;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioAdopcion {

    Adopcion a1 = new Adopcion();
    ServicioPersona sp = new ServicioPersona();
    ServicioPerro sp1 = new ServicioPerro();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    HashMap<Persona, Perro> adoptado = new HashMap();

    public void Personas() {
        sp.IngresodePersonas();
        a1.setIndividuos(sp.individuo);

    }

    public void Perros() {
        sp1.IngresodePerros();
        a1.setPichos(sp1.pichichos);
    }

    public void MostarPersonas() {
        for (int i = 0; i < a1.getIndividuos().size(); i++) {
            System.out.println(a1.getIndividuos().get(i));
        }
    }

    public void MostrarPerros() {
        for (int i = 0; i < a1.getPichos().size(); i++) {
            System.out.println(a1.getPichos().get(i));
        }
    }

    public void Adopcion() {
        String opcion;
        do {
            System.out.println("Servicio de Adopcion");
            System.out.println("--------------------");
            System.out.println("Ingrese su nombre y apellido");
            System.out.println("nombre: ");
            String nombre = leer.next();
            System.out.println("apellido: ");
            String apellido = leer.next();
            int cont = 0;
            for (int i = 0; i < a1.getIndividuos().size(); i++) {
                if (a1.getIndividuos().get(i).getNombre().equalsIgnoreCase(nombre) && a1.getIndividuos().get(i).getApellido().equalsIgnoreCase(apellido)) {
                    System.out.println("Persona habilitada para adoptar");
                    System.out.println("");
                    cont = 1;
                    int a = 0;
                    System.out.println("Lista de perros en Adopcion...");
                    MostrarPerros();
                    System.out.println("");
                    System.out.println("Ingrese el perro que desea adoptar");
                    String nomperro = leer.next();
                    for (int j = 0; j < a1.getPichos().size(); j++) {
                        if (a1.getPichos().get(j).getNombre().equalsIgnoreCase(nomperro)) {
                            adoptado.put(a1.getIndividuos().get(i), a1.getPichos().get(j));
                            a1.getPichos().remove(j);
                            a = 1;
                        }
                    }
                    if (a == 0) {
                        System.out.println("El perro ingresado no se encuentra en la lista...");
                        System.out.println("");

                    } else {
                        System.out.println("Perro Adoptado...");
                        System.out.println("");
                    }
                }
            }
            if (cont == 0) {
                System.out.println("La persona ingresada no se encuentra en la lista para adopcion");
                System.out.println("");
            }
            System.out.println("Desea realizar otra adopcion... (S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void MostarAdopciones() {
        if (adoptado.size() == 0) {
            System.out.println("Todavia no existen adopciones...");
        } else {
            for (int i = 0; i < adoptado.size(); i++) {
                System.out.println(adoptado);
            }
        }
    }
}
