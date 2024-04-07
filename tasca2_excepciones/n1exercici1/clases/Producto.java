package tasca2_excepciones.n1exercici1.clases;
// atributos nombre y precio
public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Getters
    public String getNombre() {
        return this.nombre;
    }
    public double getPrecio() {
        return this.precio;
    }

    //Setters
    public String setNombre(String nombre) {
        return this.nombre = nombre;
    }
    public double setPrecio(double precio) {
        return this.precio = precio;
    }


}
