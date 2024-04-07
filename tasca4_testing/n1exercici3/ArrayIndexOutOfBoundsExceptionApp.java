package n1exercici3;

public class ArrayIndexOutOfBoundsExceptionApp {

    public void indexArrayException() throws ArrayIndexOutOfBoundsException {
        int[] array = new int[3];
        array[0] = 1;
        array[0] = 2;
        array[0] = 3;
        int value = array[4];
    }


}