package Entidad.Servicios;

import Entidad.RevolverdeAgua;

/**
 *
 * @author Tonna/SA FR34K
 */
/*• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/
public class ServicioRdA {

    RevolverdeAgua d1 = new RevolverdeAgua();
    boolean moja;

    public void llenar() {

        d1.setPoscactualtambor((int) (Math.random() * 6) + 1);
        d1.setPoscagua((int) (Math.random() * 6) + 1);
        for (int i = 0; i < d1.revolver.length; i++) {
            if (d1.getPoscagua() == (i + 1)) {
                d1.revolver[i] = 1;
            } else {
                d1.revolver[i] = 0;
            }
        }
        for (Object aux : d1.revolver) {
            System.out.print(aux + " ");
        }
        System.out.println("");
    }

    public boolean mojar() {
        if (d1.getPoscactualtambor() > 6) {
            d1.setPoscactualtambor(1);
        }
        if (d1.getPoscagua() == d1.getPoscactualtambor()) {
            moja = true;
        } else {
            moja = false;
        }
        return moja;
    }

    public void siguientechorro() {
        do {
            mojar();
            if (moja == false && d1.getPoscactualtambor() <= 6) {
                d1.setPoscactualtambor((d1.getPoscactualtambor() + 1));
                System.out.println("Seco");

            }
            if (moja == true) {
                System.out.println("Mojado");
                break;
            }
            if (d1.getPoscactualtambor() == 7) {
                d1.setPoscactualtambor(1);
            }
        } while (!moja == true);
    }

    public void Mostrar() {
        System.out.println("");
        System.out.println("Posicion del tambor del revolver: " + d1.getPoscactualtambor());
        System.out.println("Posicion del agua en el tambor: " + d1.getPoscagua());

    }
}
