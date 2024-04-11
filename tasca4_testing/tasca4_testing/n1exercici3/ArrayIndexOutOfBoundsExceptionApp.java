package n1exercici3;

public class ArrayIndexOutOfBoundsExceptionApp {
    static int[] array = {55, 14, 99, 71, 29, 20};

    public void throwArrayIndexOutOfBoundsException(int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("La pocicion " + index + " de la lista no es valida o no existe.");
        }
        System.out.println("En la pocicion " + (index + 1) + " de la lista es el numero: " + array[index]);
    }


}