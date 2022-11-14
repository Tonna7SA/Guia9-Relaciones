package Entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Perro {

    private String nombre;
    private String raza;
    private Integer edad;
    private String porte;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String porte) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.porte = porte;
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

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", porte=" + porte + '}';
    }
    
    
}
