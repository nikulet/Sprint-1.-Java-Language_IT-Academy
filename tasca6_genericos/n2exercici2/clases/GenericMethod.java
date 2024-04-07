package tasca6_genericos.n2exercici2.clases;

public class GenericMethod {

    public static <T> void metodoGenerico(T... argumentos) {
        for (T argumento : argumentos) {
            System.out.println(argumento);
        }
    }

}