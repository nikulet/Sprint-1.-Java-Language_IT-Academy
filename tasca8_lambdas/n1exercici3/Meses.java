package tasca8_lambdas.n1exercici3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Meses {

    List<String> months = new ArrayList<>(Arrays.asList("Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio",
            "Agosto", "Septiembre","Octubre","Noviembre","Diciembre"));

    public void printMonths() {
        months.forEach(month -> System.out.println(month));
    }

}