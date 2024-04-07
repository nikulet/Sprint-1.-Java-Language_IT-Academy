package tasca8_lambdas.n1exercici8;

public class App {
    public static void main(String[] args) {

        FuncionalInterface cadena = (datos -> new StringBuilder(datos).reverse().toString()); // ago la inviersion de cadena
        //Llamamo el metodo de la interface para optener el rezultado final de la cadena inversada.
        System.out.println(cadena.inversado("Hola mundo."));

    }
}