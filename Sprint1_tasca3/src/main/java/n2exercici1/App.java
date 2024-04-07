package n2exercici1;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {

        HashMap<String, Integer> datos = new HashMap<>();  //Los datos guardados

        Restaurante r1 = new Restaurante("McDonald's", 4);
        Restaurante r2 = new Restaurante("McDonald'", 3);

        r1.comprobacionNoDublicados(datos);
        r2.comprobacionNoDublicados(datos);
        r1.comprobacionNoDublicados(datos);

        System.out.println("\nLista con todos Restaurantes y sus puntaciones: " + datos);

    }
}