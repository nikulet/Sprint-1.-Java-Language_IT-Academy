package tasca7_anotations.n1exercici1;

import tasca7_anotations.n1exercici1.clases.Trabajador;
import tasca7_anotations.n1exercici1.clases.TrabajadorOnline;
import tasca7_anotations.n1exercici1.clases.TrabajadorPresencial;

public class App {
    public static void main(String[] args) {

        Trabajador trabajador = new Trabajador("Pepe", "Perez", 84.8);
        System.out.println(trabajador + "" + trabajador.calcularSueldo(38.7) + " €.");

        TrabajadorPresencial presencial = new TrabajadorPresencial("Alex", "Martinez", 92.3);
        System.out.println(presencial + "" + presencial.calcularSueldo(40.5) + " €.");

        TrabajadorOnline online = new TrabajadorOnline("Nico", "Gonzalez", 79.6);
        System.out.println(online + "" + online.calcularSueldo(38.2) + " €.");

    }
}