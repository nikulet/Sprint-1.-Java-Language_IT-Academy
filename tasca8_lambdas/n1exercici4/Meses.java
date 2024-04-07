package tasca8_lambdas.n1exercici4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meses {

    private final List<String> months = new ArrayList<>(Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
            "Agosto", "Septiembre","Octubre","Noviembre","Diciembre"));

    public void printMonths() {
        months.forEach(System.out::println);  //metodo reference que es con los puntos
    }

}