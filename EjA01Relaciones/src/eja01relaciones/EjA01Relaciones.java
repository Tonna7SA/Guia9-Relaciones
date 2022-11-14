package eja01relaciones;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author Tonna/SA FR34K
*
 */

/*1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.*/

public class EjA01Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        
        p1.setNombre("Marvin");
        p1.setRaza("Caniche");
        p1.setEdad(2);
        p1.setPorte("Chico");
        
        p2.setNombre("Duque");
        p2.setRaza("Labrador");
        p2.setEdad(4);
        p2.setPorte("Grande");
        
        Persona d1 = new Persona();
        Persona d2 = new Persona();

        d1.setNombre("Gonzalo");
        d1.setApellido("Barrasa");
        d1.setEdad(46);
        d1.setDNI(24932895);
        d1.setPerro(p1);

        d2.setNombre("Pierre");
        d2.setApellido("Nodoyuna");
        d2.setEdad(50);
        d2.setDNI(12345678);
        d2.setPerro(p2);
        
        System.out.println(d1.toString());
        System.out.println(d2.toString());
    }

}
