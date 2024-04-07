package tasca7_anotations.n1exercici2.clases;

public class TrabajadorOnline extends Trabajador {

    public static final int TARIFA_PLANA_INTERNET = 82;

    public TrabajadorOnline(String nombre, String apellido, int precioHora) {
        super(nombre, apellido, precioHora);
    }

    @Override
    public int calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + TARIFA_PLANA_INTERNET;
    }

    @Deprecated
    public int metodoCalcularSueldoOnlineObsoleto(int horasTrabajadas) {
        return  (super.calcularSueldo(horasTrabajadas) + (TARIFA_PLANA_INTERNET + 15));
    }

    @Override
    public String toString() {
        return super.toString() + "trabajando Online ";
    }


}