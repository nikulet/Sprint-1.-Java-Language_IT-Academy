package tasca1_herencia_y_polimorfismo.n1exercici2.tipoVehiculo;
public class Coche {
    // Los atributos modelos y potencia se puede inicializar en el constructor de la clase Coche, y la marca no
    private static final String marca = "Volvo";  //Marca no se puede inicializar en el constructor de la clase Coche
    private static String modelo;
    private int POTENCIA;

    public Coche(String modelo, int POTENCIA) {
        this.modelo = modelo;
        this.POTENCIA = POTENCIA;
    }

    public static String getModelo() {
        return modelo;
    }

    public int getPOTENCIA() {
        return POTENCIA;
    }

    public static void setModelo(String modelo) {
        Coche.modelo = modelo;
    }

    public static void frenar() {
        System.out.println("El vehículo está frenando.");
    }

    public void acelerar() {
        System.out.println("El vehículo está acelerando.");
    }


}