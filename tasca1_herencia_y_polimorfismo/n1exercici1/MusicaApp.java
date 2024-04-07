
package tasca1_herencia_y_polimorfismo.n1exercici1;

import tasca1_herencia_y_polimorfismo.n1exercici1.instrumentoMusica.instrumentos.Cuerda;
import tasca1_herencia_y_polimorfismo.n1exercici1.instrumentoMusica.instrumentos.Percusion;
import tasca1_herencia_y_polimorfismo.n1exercici1.instrumentoMusica.instrumentos.Viento;

public class MusicaApp {
        public static void main(String[] args) {

            System.out.print("Los instrumentos que se usa en la musica son:\n1. ");
            Viento viento = new Viento("Saxofon", 1250);
            viento.tocar();

            System.out.print("2. ");
            Cuerda cuerda = new Cuerda("Guitarra", 200);
            cuerda.tocar();

            System.out.print("3. ");
            Percusion percusion = new Percusion("Maraca", 550);
            percusion.tocar();

        }
    }