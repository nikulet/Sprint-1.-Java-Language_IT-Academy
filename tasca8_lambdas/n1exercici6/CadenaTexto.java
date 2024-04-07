package tasca8_lambdas.n1exercici6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CadenaTexto {

    public void ordenar() {  //metodo que ordina la lista de forma ascendente
         List<Object> lista = new ArrayList<>(Arrays.asList(1, "Andalucia", 2, "Catalunya", 3, "Aragon",
                4, "Asturias", 5, "Cantabria", 6, "Valencia", 7, "Murcia", 8, "Valladolid", 9, "Vizcaya",
                 10, "Zaragoza", 11, "Navarra", 12, "La Rioja", 13, "Ceuta", 14, "Melilla"));

        lista.sort(Comparator.comparingInt(a -> a.toString().length()));  //sorteo de la lista
        lista.forEach(System.out::println);
    }

}