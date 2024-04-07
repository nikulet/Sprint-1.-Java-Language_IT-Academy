package tasca6_genericos.n1exercici1;

import tasca6_genericos.n1exercici1.clase.NoGenericMethods;

public class App {
    public static void main(String[] args) {

        NoGenericMethods lista1 = new NoGenericMethods(2.2,4.5,6.7);
        NoGenericMethods lista2 = new NoGenericMethods(4.5,6.7,2.2);
        NoGenericMethods lista3 = new NoGenericMethods(6.7,2.2,4.5);

        lista1.extrae();
        lista2.extrae();
        lista3.extrae();

        System.out.println("******");
        System.out.println(lista1.getDecimal1());
        System.out.println(lista2.getDecimal3());
        System.out.println(lista3.getDecimal2());

        System.out.println("******");
        System.out.println(lista1.getDecimal1() + "\n" + lista2.getDecimal3() + "\n" + lista3.getDecimal2());

    }
}