package tasca2_excepciones.n1exercici1.clases;
public class VentaVaciaException extends Exception {
    public VentaVaciaException() {
        super("Para hacer una venta primero debes añadir productos.");
    }

}