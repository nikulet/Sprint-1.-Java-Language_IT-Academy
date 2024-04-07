package tasca7_anotations.n1exercici1.clases;

public class TrabajadorOnline extends Trabajador {

    public static final double TARIFA_PLANA_INTERNET = 82.5;

    public TrabajadorOnline(String nombre, String apellido, double precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public double calcularSueldo(double horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + TARIFA_PLANA_INTERNET;
    }

    @Override
    public String toString() {
        return super.toString() + "trabajando Online ";
    }


}