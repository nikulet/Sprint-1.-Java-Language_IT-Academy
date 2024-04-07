package tasca7_anotations.n1exercici2.clases;

public class TrabajadorPresencial extends Trabajador {
    private static int gasolina = 14;

    public TrabajadorPresencial(String nombre, String apellido, int precioHora) {
        super(nombre, apellido, precioHora);
    }


    public static int getGasolina() {
        return gasolina;
    }

    public static void setGasolina(int gasolina) {
        TrabajadorPresencial.gasolina = gasolina;
    }

    @Override
    public int calcularSueldo(int horasTrabajadas) {
        return super.calcularSueldo(horasTrabajadas) + gasolina;
    }


    @Deprecated
    public int metodoCalcularSueldoPresencialObsoleto(int horasTrabajadas) {
        return (super.calcularSueldo(horasTrabajadas) + (gasolina * 2));
    }

    @Override
    public String toString() {
        return super.toString() + "trabajando presencialmente ";
    }

}