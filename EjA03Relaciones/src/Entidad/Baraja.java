
package Entidad;

import java.util.LinkedList;
import java.util.Objects;


/**
 *
 * @author Tonna/SA FR34K
 */
/**/
public class Baraja {
   public String palo;
   public Integer numerocarta;
   
   public LinkedList<Baraja> bar;

    public Baraja() {
    }

    public Baraja(LinkedList<Baraja> bar) {
        this.bar = bar;
    }

    public LinkedList<Baraja> getBar() {
        return bar;
    }

    public void setBar(LinkedList<Baraja> bar) {
        this.bar = bar;
    }

    public Baraja(String palo, Integer numerocarta) {
        this.palo = palo;
        this.numerocarta = numerocarta;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public Integer getNumerocarta() {
        return numerocarta;
    }

    public void setNumerocarta(Integer numerocarta) {
        this.numerocarta = numerocarta;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.palo);
        hash = 53 * hash + Objects.hashCode(this.numerocarta);
        hash = 53 * hash + Objects.hashCode(this.bar);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Baraja other = (Baraja) obj;
        if (!Objects.equals(this.palo, other.palo)) {
            return false;
        }
        if (!Objects.equals(this.numerocarta, other.numerocarta)) {
            return false;
        }
        return Objects.equals(this.bar, other.bar);
    }

    @Override
    public String toString() {
        return "Baraja{" + "palo=" + palo + ", numerocarta=" + numerocarta + '}';
    }

}
