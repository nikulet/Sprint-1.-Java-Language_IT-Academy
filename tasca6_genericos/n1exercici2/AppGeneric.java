package tasca6_genericos.n1exercici2;

import tasca6_genericos.n1exercici2.clases.GenericMethod;
import tasca6_genericos.n1exercici2.clases.Personas;

public class AppGeneric {
    public static void main(String[] args) {

        Personas persona = new Personas("Maria", "Garcia", 25);
        String mensaje = "Hola, ¿cómo estás?";
        double numero = 3.14;

        GenericMethod.metodoGenerico(persona, mensaje, numero);
        //GenericMethods.metodoGenerico(12,"ana vine",23);

    }
}