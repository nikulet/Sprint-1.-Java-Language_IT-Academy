package n1exercici1.test;

import n1exercici1.AppMainCalendario;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class AppMainCalendarioTest {

    final AppMainCalendario calendario = new AppMainCalendario();

    @Test
    @DisplayName("Comprobacion de la longitud array")
    void testingLongitud() {
        assertEquals(12,calendario.meses.size());
    }

    @Test
    @DisplayName("Comprobacion que la lista no es nula")
    void comprobacionArrayNoNulo() {
        assertNotNull(calendario.meses);
    }

    @Test
    @DisplayName("Comprobacion que en la pocicion 8 de la lista es el mes Augosto")
    void comprobacionPocicionMes() {
        assertEquals("agosto", calendario.meses.get(7), "La pocicion del mes augosto no es correcta.");
    }

}