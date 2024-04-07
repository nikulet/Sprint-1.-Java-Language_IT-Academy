package tasca6_genericos.n2exercici2;

import tasca6_genericos.n2exercici2.clases.GenericMethod;
import tasca6_genericos.n2exercici2.clases.Persona;

public class App {
    public static void main(String[] args) {

        Persona persona = new Persona("Maria", "Garcia", 25);
        String mensaje = "Hola, ¿cómo estás?";
        String numero = "Bien gracés";

        GenericMethod.metodoGenerico(persona, mensaje, numero);
        System.out.println();
        GenericMethod.metodoGenerico("Hola", new Persona("Nico", "Lopez", 63));

    }
}