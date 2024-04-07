package tasca8_lambdas.n1exercici1;

import java.util.List;
import java.util.stream.Collectors;

public class Lista {

    public void ocupaciones(List<String> ocupaciones) {

        List<String> stream = ocupaciones.stream()
            .filter(t -> t.toLowerCase().contains("o"))
            .collect(Collectors.toList());

        System.out.print("Lista de las ocupaciones que contienen la letra 'o': ");
        for (String profeciones : stream) {
            if (stream.indexOf(profeciones) != stream.size() - 1) {
                System.out.print(profeciones + ", ");
            } else {
                System.out.print("y " + profeciones + ".");
            }

        }

    }


}