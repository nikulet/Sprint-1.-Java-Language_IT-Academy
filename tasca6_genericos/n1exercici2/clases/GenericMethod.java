package tasca6_genericos.n1exercici2.clases;

public class GenericMethod {

    public static <T> void metodoGenerico(T argumento1, T argumento2, T argumento3) {
        System.out.println(argumento1);
        System.out.println(argumento2);
        System.out.println(argumento3);
    }

}