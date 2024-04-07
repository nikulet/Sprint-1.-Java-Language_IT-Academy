package tasca1_herencia_y_polimorfismo.n1exercici2;

import tasca1_herencia_y_polimorfismo.n1exercici2.tipoVehiculo.Coche;

public class VechiculoApp {
    public static void main(String[] args) {

        Coche coche = new Coche("V50", 12);

        System.out.print("En el momento de acelerar: ");
        coche.acelerar();

        System.out.print("En el momento de frenar: ");
        Coche.frenar();

    }
}