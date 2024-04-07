package tasca6_genericos.n1exercici2.clases;

public class Personas {

    private String nombre;
    private String apellido;
    private int edad;

    public Personas(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String toString(){
        return "Mi nombre es " + nombre + " con apellido " + apellido + " y tengo " + edad + " años.\n";
    }

}