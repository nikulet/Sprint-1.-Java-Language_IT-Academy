package tasca2_excepciones.n1exercici1;

import tasca2_excepciones.n1exercici1.clases.Producto;
import tasca2_excepciones.n1exercici1.clases.Venta;
import java.util.ArrayList;

public class App {

    public static void main(String[] args)  {

        //Instanciamento de la lista de productos
        ArrayList<Producto> productos = new ArrayList<>();

        //creación de productos
        Producto producto = new Producto("pan", 1.15);
        Producto producto1 = new Producto("pan", 1.15);
        Producto producto2 = new Producto("pan", 1.15);

        //agregar los productos creados a la lista de productos
        productos.add(producto);
        productos.add(producto1);
        productos.add(producto2);

        //Ejemplo cuando la lista de productos no es vacia y nos devuelve el total de la suma de todos productos
        Venta venta = new Venta(productos);
        venta.calcularTotal(); //Llamamos el metodo personalizado para mostrar en pantalla el resultado final

        productos.clear();  //He borrado todos productos creados anerioramente y ahora la lista esta vacia
        System.out.print("\nCaso de una lista vacia: ");

        //Ejemplo cuando la lista de productos es vacia y que nos capturar una excepción de tipo ArrayIndexOutOfBoundsException.
        Venta venta1 = new Venta(productos);
        venta1.calcularTotal(); //Llamamos el metodo personalizado para mostrar en pantalla el resultado final en este caso una exception

    }
}