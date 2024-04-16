package n1exercici3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayIndexOutOfBoundsExceptionAppTest {

    @Test
    public void comprobarExcepcion() {
        ArrayIndexOutOfBoundsExceptionApp nuevaLista = new ArrayIndexOutOfBoundsExceptionApp();
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> nuevaLista.comprobarExcepcion(6));
    }

}