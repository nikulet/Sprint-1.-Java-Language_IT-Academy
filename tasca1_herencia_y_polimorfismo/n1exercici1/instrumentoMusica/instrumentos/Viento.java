package tasca1_herencia_y_polimorfismo.n1exercici1.instrumentoMusica.instrumentos;

import tasca1_herencia_y_polimorfismo.n1exercici1.instrumentoMusica.InstrumentoMusical;

public class Viento extends InstrumentoMusical {

    public Viento(String nombre, float precio) {
        super(nombre, precio);
    }

    @Override
    public void tocar() {
        System.out.println("Está sonando un instrumento de viento.");
    }

}