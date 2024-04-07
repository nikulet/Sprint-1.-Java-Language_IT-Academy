package tasca7_anotations.n1exercici1.clases;

public class Trabajador {

    private String nombre;
    private String apellido;
    private double precioHora;

    public Trabajador(String nombre, String apellido, double precioHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.precioHora = precioHora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double calcularSueldo(double horasTrabajadas){
        return (horasTrabajadas * precioHora);
    }

    public String toString(){
        return "Mi nombre es " + nombre + " " + apellido + ", y he ganado ";
    }


}