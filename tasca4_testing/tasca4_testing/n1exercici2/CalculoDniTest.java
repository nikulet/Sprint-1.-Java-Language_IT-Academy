package n1exercici2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculoDniTest {


    @DisplayName("Test para verificar el cálculo de la letra del DNI")
    @ParameterizedTest
    @CsvSource({"79285189,'A'", "14019341,'Y'", "14227901,'D'", "14167290,'R'", "77654421,'X'", "41710454, 'T'", "34567890, 'R'", "58269437, 'F'", "65796987, 'T'", "35426244, 'B'"})
    public void testCalcularLetraDNI(int numeroDNI, char letraEsperada) {
        assertEquals(letraEsperada, CalculoDniApp.calcularLetraDNI(numeroDNI));
    }

}