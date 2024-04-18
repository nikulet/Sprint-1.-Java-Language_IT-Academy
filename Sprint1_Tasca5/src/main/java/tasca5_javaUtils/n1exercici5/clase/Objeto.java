package tasca5_javaUtils.n1exercici5.clase;

import java.io.Serializable;

public class Objeto implements Serializable {
    private String objetoSaludar = "Un saludo desde Catalunya";

    @Override
    public String toString() {
        return "Contenido: " + objetoSaludar;
    }
}