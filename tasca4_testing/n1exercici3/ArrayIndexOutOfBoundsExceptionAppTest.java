package n1exercici3;

import n1exercici3.ArrayIndexOutOfBoundsExceptionApp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArrayIndexOutOfBoundsExceptionAppTest {

    @Test
    @DisplayName("Comprobar la excepció ArrayIndexOutOfBoundsException")
    public void testThrowArrayIndexOutOfBoundsException() {
        ArrayIndexOutOfBoundsExceptionApp example = new ArrayIndexOutOfBoundsExceptionApp();
        example.indexArrayException();
    }
}