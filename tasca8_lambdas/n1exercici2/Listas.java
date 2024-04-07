package tasca8_lambdas.n1exercici2;

import java.util.List;
import java.util.stream.Collectors;

public class Listas {

    public void ocupaciones(List<String> ocupaciones) {

        List<String> stream = ocupaciones.stream()
                .filter(letra -> letra.toLowerCase().contains("o"))
                .filter(letra -> letra.length() > 5)
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