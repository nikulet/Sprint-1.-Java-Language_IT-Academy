package tasca1_herencia_y_polimorfismo.n1exercici1.instrumentoMusica;
public abstract class InstrumentoMusical {

    {
        System.out.println("Bloque de inicialización");
    }

    private String nombre;
    private float precio;

    public InstrumentoMusical(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public abstract void tocar();  //Un metodo Abstract nunca no tiene cuerpo

    static {
        System.out.println("La clase Instrumento ha sido cargada");
    }

}