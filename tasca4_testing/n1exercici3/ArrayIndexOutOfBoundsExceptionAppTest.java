package n1exercici3;

import org.junit.jupiter.api.Test;

public class ArrayIndexOutOfBoundsExceptionAppTest {

    @Test
    public void comprobarExcepcion() {
        ArrayIndexOutOfBoundsExceptionApp nuevaLista = new ArrayIndexOutOfBoundsExceptionApp();
        nuevaLista.throwArrayIndexOutOfBoundsException(5);
    }

}