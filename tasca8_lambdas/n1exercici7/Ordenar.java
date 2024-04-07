package tasca8_lambdas.n1exercici7;

import java.util.*;

public class Ordenar {

    public static void ordenar() {
        List<Object> lista = new ArrayList<>(Arrays.asList(1, "Andalucia", 2, "Catalunya", 3, "Aragon",
                4, "Asturias", 5, "Cantabria", 6, "Valencia", 7, "Murcia", 8, "Valladolid", 9, "Vizcaya",
                10, "Zaragoza", 11, "Navarra", 12, "La Rioja", 13, "Ceuta", 14, "Melilla"));

        lista.sort(Comparator.comparingInt(o -> o.toString().length()));
        Collections.reverse(lista); // Inverto el orden de la lista
        lista.forEach(System.out::println);
    }

}