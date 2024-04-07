package tasca6_genericos.n2exercici1.clases;

public class GenericMethod {

    public static <T> void metodoGenerico(T argumento1, T argumento2, String argumento3) {
        System.out.println(argumento1);
        System.out.println(argumento2);
        System.out.println(argumento3);
    }

}