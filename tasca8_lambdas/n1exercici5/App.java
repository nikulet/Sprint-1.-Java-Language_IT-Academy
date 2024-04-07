package tasca8_lambdas.n1exercici5;

public class App {
    public static void main(String[] args) {

        Funcional pi = () -> 3.1415;  //instancia la interfaz y asigno el valor 3.1415
        System.out.println(pi.getPiValue());

    }
}