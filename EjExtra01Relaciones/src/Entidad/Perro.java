
package Entidad;


/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Perro {
private String nombre;
private String raza;
private String tamano;

    public Perro() {
    
    }
    public Perro(String nombre, String raza, String tamano) {
        this.nombre = nombre;
        this.raza = raza;
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", tamaño=" + tamano + '}';
    }

 

    
}
