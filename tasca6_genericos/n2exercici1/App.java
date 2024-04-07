package tasca6_genericos.n2exercici1;

import tasca6_genericos.n2exercici1.clases.GenericMethod;
import tasca6_genericos.n2exercici1.clases.Persona;

public class App {
    public static void main(String[] args) {

        Persona persona = new Persona("Maria", "Garcia", 25);
        String mensaje = "Hola, ¿cómo estás?";
        String respuesta = "Bien gracias";

        GenericMethod.metodoGenerico(persona, mensaje, respuesta);
        //GenericMethods.metodoGenerico(12,"ana vine",23);

    }
}