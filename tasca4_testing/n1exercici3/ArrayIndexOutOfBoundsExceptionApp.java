package n1exercici3;

public class ArrayIndexOutOfBoundsExceptionApp {

   private final int[] listaNunumeros = {55, 14, 99, 71, 29, 20};

    public void comprobarExcepcion(int indiceArray) throws ArrayIndexOutOfBoundsException {

        System.out.println(listaNunumeros[indiceArray]);

    }

}