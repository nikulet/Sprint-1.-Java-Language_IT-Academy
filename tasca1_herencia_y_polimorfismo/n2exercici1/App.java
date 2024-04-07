package tasca1_herencia_y_polimorfismo.n2exercici1;

import tasca1_herencia_y_polimorfismo.n2exercici1.clases.Smartphone;

public class App {
    public static void main(String[] args) {

        Smartphone smartphone = new Smartphone("Nokia", "T8");
        smartphone.llamar("625496281");
        smartphone.fotografiar();
        smartphone.alarma();

    }
}