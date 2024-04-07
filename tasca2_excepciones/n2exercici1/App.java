package tasca2_excepciones.n2exercici1;

public class App {
    public static void main(String[] args) {

        byte edad = (Entrada.leerByte("Escribe tu edad: "));
        int anoNacimento = (Entrada.leerInt("Escribe tu año de nacimiento: "));
        float diasTrabajadas = (Entrada.leerFloat("Escribe el total de dias trabajadas para este año (con decimales): "));
        double diasVacaciones = (Entrada.leerDouble("Escri los dias que te quedan de vacaciones para este año(con decimales): "));
        char caracterFavorit = (Entrada.leerChar("Escribe un cualquier caracter favorito o el que mas te guste: "));
        String nombreApellido = (Entrada.leerString("Escribe su nombre y apellido: "));
        boolean conducirAuto = (Entrada.leerSiNo("Tegusta conducir un auto (s/n) ? "));


        System.out.println("Me llamo " + nombreApellido + " y tengo " + edad + " anos, naci en el año " + anoNacimento + " y me quedan " +
                diasVacaciones + " dias de vacido para este año, me gusta el caracter " + caracterFavorit + " y " +
                conducirAuto + " tiengo experiencia en conducir un auto, y he trabajado " + diasTrabajadas + " dias en este año.");
    }
}