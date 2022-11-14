/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejmao01relaciones;

import Entidad.DNI;
import Entidad.Persona;

/**
 *
 * @author gjbar
 */
/*EJERCICIO PERSONA
Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un 
objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba 
acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.*/

public class EjMAO01Relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DNI d2 = new DNI();
        d2.setTipo("DNI");
        d2.setNumero(24932895);
        Persona datos = new Persona();
        datos.setNombre("Gonzalo");
        datos.setApellido("Barrasa");
        datos.setDni(d2);
        System.out.println(datos.toString());
    }
    
}
