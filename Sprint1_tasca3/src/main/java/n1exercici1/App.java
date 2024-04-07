package n1exercici1;

import n1exercici1.classe.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class App {
    public static void main(String[] args) {

        ArrayList<Month> meses = new ArrayList<Month>();

        Month month = new Month("enero");
        Month month1 = new Month("febrero");
        Month month2 = new Month("marzo");
        Month month3 = new Month("abril");
        Month month4 = new Month("mayo");
        Month month5 = new Month("junio");
        Month month6 = new Month("julio");
        Month month7 = new Month("septiembre");
        Month month8 = new Month("octubre");
        Month month9 = new Month("noviembre");
        Month month10 = new Month("diciembre");

        meses.add(month);
        meses.add(month1);
        meses.add(month2);
        meses.add(month3);
        meses.add(month4);
        meses.add(month5);
        meses.add(month6);
        meses.add(month7);
        meses.add(month8);
        meses.add(month9);
        meses.add(month10);

            System.out.print("\n******************************************************************************************************\n" +
                    "Lista de meses que no contiene el mes Augosto:  \n");
            //Muestra en la consola la lista de Objectos del array actual sin el mes de august
            for(Month mes : meses){
                    System.out.print(mes.getName() + " ");
            }
            System.out.println("\n******************************************************************************************************");

                meses.add(7, new Month("agosto"));  //Anadendo el mes de augosto en lalista de Objectos de meses en la pocision corespondente

            System.out.print("Lista de meses que contiene incluido el mes Augosto:  \n");
            //Muestra en la consola la lista de Objectos del array actual con el mes de augusto
            for(Month mes : meses){
                    System.out.print(mes.getName() + " ");
            }
            System.out.println("\n******************************************************************************************************");

            //Anadimos en la lista de Objectos otos 2 mas Objectos para tener en la lista Objectos que se repitan y que adelante demonstrar el funcionamento de la clase HashSet
            meses.add(month);
            meses.add(month1);

            System.out.print("Lista de meses que contiene incluido el mes Augosto y 2 meses que se repita:  \n");
            //Muestra en la consola la lista de Objectos del array actual con el mes de august y dos meses mas que se anadido
            for(Month mes : meses){
                    System.out.print(mes.getName() + " ");
            }
            System.out.println("\n******************************************************************************************************");


            //Conversion del ArrayList de objectos de tipo Month en un HashSet
            HashSet<Month> months = new HashSet<>(meses);

            System.out.print("Lista de meses que contiene incluido el mes Augosto y con comprobacion que no se repite algun Objecto:  \n");
            //Recorre la lista con un for
            for(Month mes : months){
                    System.out.print(mes.getName() + " ");
            }
            System.out.println("\n******************************************************************************************************");

            //se ha creado un objecto mas y se anade en la lista y que esta repetendose de 2 vezes en la lista de Objectos
            months.add(month5);

            System.out.print("Lista de meses que contiene incluido el mes Augosto y con comprobacion que no se repite algun Objecto (recorida con iterador):  \n");
            //Recorre la lista con un iterador
            Iterator<Month> iteratorMeses = months.iterator();
            while (iteratorMeses.hasNext()) {
                    System.out.print(iteratorMeses.next().getName() + " ");
            }
            System.out.println("\n******************************************************************************************************");


    }
}