package n1exercici2;

public class CalculoDniApp {

    // Método para calcular la letra del DNI dado el número del DNI recibido como parámetro
    public static char calcularLetraDNI(int numeroDNI) {
        // Array con las letras del DNI en orden correcto de calculo
        char[] letrasDNI = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        // Calcular el índice de la letra correspondiente al número del DNI
        int indice = numeroDNI % 23;

        // Devolver la letra correspondiente que apartenese al numero del DNI
        return letrasDNI[indice];
    }
}