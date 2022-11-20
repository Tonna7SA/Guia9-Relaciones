package Entidad.Servicio;

import Entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class ServicioPerro {

    ArrayList<Perro> pichichos = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Perro p1 = new Perro();

    public Perro IngresoPerro() {
        if (pichichos.isEmpty()) {
            VariasPerros();
        }
        System.out.println("Alta de Perros");
        System.out.println("--------------");
        System.out.println("Ingrese el nombre del perro: ");
        String nombre = leer.next();
        nombre = nombre.toUpperCase().substring(0, 1).concat(nombre.toLowerCase().substring(1));
        p1.setNombre(nombre);
        System.out.println("Ingrese la raza del perro: ");
        String raza = leer.next();
        raza = raza.toUpperCase().substring(0, 1).concat(raza.toLowerCase().substring(1));
        p1.setRaza(raza);
        System.out.println("Ingrese el tamaño del perro: ");
        String tamano = leer.next();
        tamano = tamano.toUpperCase().substring(0, 1).concat(tamano.toLowerCase().substring(1));
        p1.setTamano(tamano);
        return new Perro(p1.getNombre(), p1.getRaza(), p1.getTamano());
    }

    public void IngresodePerros() {
        String opcion;
        do {
            pichichos.add(IngresoPerro());
            System.out.println("Desea ingresa otro perro (S/N)");
            opcion = leer.next();
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void MostrarPerros() {
        for (Perro aux : pichichos) {
            System.out.println(aux);
        }
    }

    public void VariasPerros() {
        pichichos.add(new Perro("Titan", "Ovejero", "Grande"));
        pichichos.add(new Perro("Sultan", "Callejero", "Chico"));
        pichichos.add(new Perro("Rocky", "Labrador", "Grande"));
        pichichos.add(new Perro("Flor", "Chiwawa", "Chico"));
        pichichos.add(new Perro("Simon", "Boxer", "Mediano"));
        pichichos.add(new Perro("Champion", "Doberman", "Grande"));
        pichichos.add(new Perro("Ramon", "Pug", "Chico"));
        pichichos.add(new Perro("Tango", "Dogo", "Grande"));
    }
}
