package Entidad.Servicio;

import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioPersona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona p1 = new Persona();
    ArrayList<Persona> individuo = new ArrayList();

    public Persona IngresoPersona() {
        if (individuo.isEmpty()) {
            VariasPersonas();
        }
        System.out.println("Alta de Personas");
        System.out.println("------------------");
        System.out.println("Ingrease el nombre de la persona: ");
        String nombre = leer.next();
        nombre = nombre.toUpperCase().substring(0, 1).concat(nombre.toLowerCase().substring(1));
        p1.setNombre(nombre);
        System.out.println("Ingrese el apellido de la persona: ");
        String apellido = leer.next();
        apellido = apellido.toUpperCase().substring(0, 1).concat(apellido.toLowerCase().substring(1));
        p1.setApellido(apellido);
        return new Persona(p1.getNombre(), p1.getApellido());

    }

    public void IngresodePersonas() {
        individuo = new ArrayList();
        String opcion;
        do {
            individuo.add(IngresoPersona());
            System.out.println("Desea ingresa otra persona (S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void MostrarPersonas() {
        for (Persona aux : individuo) {
            System.out.println(aux);
        }
    }

    public void VariasPersonas() {
        individuo.add(new Persona("Martin", "Caseres"));
        individuo.add(new Persona("Pablo", "Gonzaloez"));
        individuo.add(new Persona("Jose", "Lopez"));
        individuo.add(new Persona("Pedro", "Garcia"));
        individuo.add(new Persona("Carlos", "Moron"));
        individuo.add(new Persona("Rodrigo", "Parlo"));
        individuo.add(new Persona("Guillermo", "Luciani"));
        individuo.add(new Persona("Francisco", "Monzon"));
        individuo.add(new Persona("Esteban", "Sanchez"));
        individuo.add(new Persona("Franco", "Vencia"));
        individuo.add(new Persona("Sergio", "Parses"));
        individuo.add(new Persona("Antonio", "Morales"));
        individuo.add(new Persona("Roberto", "Sabas"));
        individuo.add(new Persona("Raul", "Tersa"));
    }

}
