package tasca7_anotations.n1exercici2;

import tasca7_anotations.n1exercici2.clases.TrabajadorOnline;
import tasca7_anotations.n1exercici2.clases.TrabajadorPresencial;

public class App {

    @SuppressWarnings({"deprecation"})  //Indica al compilador que ignore cualquier advertencia de deprecación

    public static void main(String[] args) {

        //Demostrasion del uso de anotacion @Override para calcular sueldo
        TrabajadorPresencial presencial = new TrabajadorPresencial("Alex", "Martinez", 92);
        System.out.println(presencial + "" + presencial.calcularSueldo(40) + " €.");

        TrabajadorOnline online = new TrabajadorOnline("Nico", "Gonzalez", 79);
        System.out.println(online + "" + online.calcularSueldo(38) + " €.\n"); //No obsoleto , es un metodo sobreescrito con @Override

        System.out.println("\nDemostrasion del uso de anotacion @Deprecated para calcular sueldo");
        System.out.println(presencial + "" + presencial.metodoCalcularSueldoPresencialObsoleto(40) +
                " € y este es la nomina del mes pasado."); // Obsoleto
        System.out.println(online + "" + online.metodoCalcularSueldoOnlineObsoleto(38) +
                " € y este es la nomina del mes pasado."); // Obsoleto

    }
}