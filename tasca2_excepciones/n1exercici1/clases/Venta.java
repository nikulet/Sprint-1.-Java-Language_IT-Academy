package tasca2_excepciones.n1exercici1.clases;

import java.util.ArrayList;

public class Venta {

    private ArrayList<Producto> listadoProductos;
    private double precioTotal;

    public Venta(ArrayList<Producto> listadoProductos) {
        this.listadoProductos = listadoProductos;
        this.precioTotal = 0.0d;
    }


    //Getters
    public ArrayList<Producto> getListadoProductos() {
        return this.listadoProductos;
    }

    public double getPrecioTotal() {
        return this.precioTotal;
    }

    //Setters
    public void setListadoProductos(ArrayList<Producto> listadoProductos) {
        this.listadoProductos = listadoProductos;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    //Metodo personalizado
    public void controlException() throws VentaVaciaException {

        if (listadoProductos.size() <= 0) {  //En caso si lista esta vacia  entonse llamamos la excepcion personalizada en exacto desde la clase VentaVaciaException()
            // que esta extendida de la clase predefinida en JAVA Exception  y con el constructor de la Clase que contene el Informe de la excepcion personalizada que puede producirce en algun momento
            throw new VentaVaciaException();
        } else {
            for (Producto producto : listadoProductos) {
                precioTotal += producto.getPrecio();
            }
        }

    }

    //Metodo personalizado para mostrar en pantalla la excepcion personalizada que se va a controlar y capturar con try catch los errores que se va
    // a genera posibilalmente en caso si la lista es vacia o en caso contrario se va a mostra en consola la suma de dinero de toda mercancia
    public void calcularTotal() {
        try {
            controlException();
            System.out.println("El total de dinero de todos los productos es: " + String.format("%.2f", precioTotal) + " €.");
        } catch (VentaVaciaException e) {
            System.out.println(e.getMessage());
        }
    }


}