package tasca7_anotations.n1exercici1.clases;

public class TrabajadorPresencial extends Trabajador {
    private static double gasolina = 14.10;

    public TrabajadorPresencial(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }


    public static double getGasolina() {
        return gasolina;
    }

    public static void setGasolina(double gasolina) {
        TrabajadorPresencial.gasolina = gasolina;
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }

    @Override
    public String toString() {
        return super.toString() + "trabajando presencialmente ";
    }


}