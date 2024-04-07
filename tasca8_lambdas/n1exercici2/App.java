package tasca8_lambdas.n1exercici2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {


        List<String> ocupaciones = new ArrayList<>(Arrays.asList("Programador", "Ingieniero", "Cocinero",
                "Medic", "Mecanico", "Profesor", "Conductor", "Dentista", "Cajera"));

        Listas lista = new Listas();
        lista.ocupaciones(ocupaciones);

    }
}