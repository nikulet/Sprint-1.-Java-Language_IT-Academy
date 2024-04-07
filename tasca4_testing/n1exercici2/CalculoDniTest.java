package n1exercici2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class CalculoDniTest {
    private int numeroDNI;
    private char letraEsperada;

    // Constructor que recibe los parámetros para cada prueba
    public CalculoDniTest(int numeroDNI, char letraEsperada) {
        this.numeroDNI = numeroDNI;
        this.letraEsperada = letraEsperada;
    }

    // Parámetros para las pruebas
    @Parameters
    @DisplayName("Lista de parámetros para las pruebas")
    public static Collection<Object[]> datosDni() {
        List<Object[]> list = new ArrayList<>();

        list.add(new Object[]{79285189, 'A'}); //Numero de DNI correcto
        list.add(new Object[]{14019341, 'Y'});
        list.add(new Object[]{14227901, 'D'}); //Numero de DNI correcto
        list.add(new Object[]{14167290, 'R'});
        list.add(new Object[]{77654421, 'X'});
        list.add(new Object[]{41710454, 'T'}); //Numero de DNI correcto
        list.add(new Object[]{34567890, 'R'});
        list.add(new Object[]{58269437, 'F'});
        list.add(new Object[]{63496181, 'T'});
        list.add(new Object[]{35426244, 'B'}); //Numero de DNI correcto

        return list;
    }

    // Test para verificar el cálculo de la letra del DNI
    @Test
    @DisplayName("Test para verificar el cálculo de la letra del DNI")
    public void testCalcularLetraDNI() {
        CalculoDniApp calculadorDni = new CalculoDniApp();  // Se crea el objeto CalculoDniApp para el test
        assertEquals(letraEsperada, calculadorDni.calcularLetraDNI(numeroDNI)); // Se compara la letra calculada con la esperada
    }

}