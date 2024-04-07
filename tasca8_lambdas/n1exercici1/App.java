package tasca8_lambdas.n1exercici1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<String> ocupaciones = new ArrayList<>(Arrays.asList("Programador", "Ingieniero", "Cocinero", "Medico",
                "Mecanico", "Profesor", "Conductor", "Dentista", "Cajera"));

        Lista lista = new Lista();
        lista.ocupaciones(ocupaciones);

    }

}