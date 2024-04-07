package n1exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MainApp {

    public static void main(String[] args) {

        //Inicializado una lista de Objectos de tipo de datos Integer con valores predeterminados
        List<Integer> listaNumeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Lista actual: " + listaNumeros);

        List<Integer> listaAraves = new ArrayList<>(); //Inicializado una Lista de Objectos vacia de tipo de datos Integer
        System.out.println("Lista nueva : " + listaAraves);

        /*ListIterator es una clase predefinida en Java que permite recorrer la lista en cualquier dirección, modificar la lista
        durante la iteración y obtener la posición actual del iterador en la lista.*/
        ListIterator<Integer> listIterator = listaNumeros.listIterator(listaNumeros.size());

        /*recorido de la lista que empeza desde fin y terminado con inicio de la lista predeterminada de arriva y cada iteracion
        esta anadeno el valor en la lista vacia que al fina se va a llenar con lista de numeros inversad*/
        while(listIterator.hasPrevious()) {
            listaAraves.add(listIterator.previous());
        }
        System.out.print("Lista inversada: " + listaAraves);
        
    }
}