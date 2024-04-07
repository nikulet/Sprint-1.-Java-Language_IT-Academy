/*Crea una clase llamada Restaurante con dos atributos: nombre(String) y puntuación(int). Implementa los métodos necesarios
para que no se puedan introducir objetos Restaurante con el mismo nombre y puntuación en un HashSet creado en el main() de la aplicación.
Importante
Puede haber restaurantes con el mismo nombre con distinta puntuación, pero no puede haber restaurantes con el mismo nombre y igual puntuación.
https://ifgeekthen.nttdata.com/es/que-es-hashset-java-y-como-comenzar-con-el
https://docs.oracle.com/javase/8/docs/api/java/util/HashSet.html
https://www.youtube.com/watch?v=YRf9k0aHtus
*/
package n2exercici1;

import java.util.Map;

public class Restaurante {

    private String nombre;
    private int puntacion;

    //private Map<Restaurante,Integer> datos;


    public Restaurante(String nombre, int puntacion) {
        this.nombre = nombre;
        this.puntacion = puntacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntacion() {
        return puntacion;
    }

    public void setPuntacion(int puntacion) {
        this.puntacion = puntacion;
    }


    public void comprobacionNoDublicados(Map<String, Integer> datos) {
        if (datos.containsKey(this.nombre)) {
            int puntuacionExistente = datos.get(this.nombre);
            if (puntuacionExistente != this.puntacion) {
                System.out.println("El restaurante " + this.nombre + " ya existe pero con una puntuación diferente.");
            } else {
                System.out.println("El restaurante " + this.nombre + " y con la puntacion " + this.puntacion + " ya existe en la lista.");
            }
        } else {
            datos.put(this.nombre, this.puntacion);
            System.out.println("El restaurante " + this.nombre + " con su puntación " + this.puntacion + " añadido en la lista.");
        }

    }


}