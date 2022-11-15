
package Entidad;

/**
 *
 * @author Tonna/SA FR34K
 */
/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición 
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del 
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.*/

public class RevolverdeAgua {
private int poscactualtambor;
private int poscagua;
public int revolver []= new int [6];


    public RevolverdeAgua() {
    }

    public RevolverdeAgua(int poscactualtambor, int poscagua, int[] revolver) {
        this.poscactualtambor = poscactualtambor;
        this.poscagua = poscagua;
        this.revolver = revolver;
    }

    public int[] getRevolver() {
        return revolver;
    }

    public void setRevolver(int[] revolver) {
        this.revolver = revolver;
    }

    public int getPoscactualtambor() {
        return poscactualtambor;
    }

    public void setPoscactualtambor(int poscactualtambor) {
        this.poscactualtambor = poscactualtambor;
    }

    public int getPoscagua() {
        return poscagua;
    }

    public void setPoscagua(int poscagua) {
        this.poscagua = poscagua;
    }

    @Override
    public String toString() {
        return "RevolverdeAgua{" + "poscactualtambor=" + poscactualtambor + ", poscagua=" + poscagua + ", revolver=" + revolver + '}';
    }

  

}
