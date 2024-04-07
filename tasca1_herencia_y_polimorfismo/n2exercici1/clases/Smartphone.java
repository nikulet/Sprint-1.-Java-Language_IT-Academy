package tasca1_herencia_y_polimorfismo.n2exercici1.clases;

import tasca1_herencia_y_polimorfismo.n2exercici1.interfazes.Camara;
import tasca1_herencia_y_polimorfismo.n2exercici1.interfazes.Reloj;

public class Smartphone extends Telefono implements Camara, Reloj {
    public Smartphone(String marca, String modelo) {
        super(marca, modelo);
    }

    @Override
    public void fotografiar() {
        System.out.println("Se está haciendo una foto.");
    }

    @Override
    public void alarma() {
        System.out.println("Está sonando la alarma.");
    }

}