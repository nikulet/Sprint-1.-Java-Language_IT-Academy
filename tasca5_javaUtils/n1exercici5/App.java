package tasca5_javaUtils.n1exercici5;
import tasca5_javaUtils.n1exercici5.clase.Objeto;
import tasca5_javaUtils.n1exercici5.clase.SerializarObjetoJava;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Escribe la ruta donde queres guardar el Objeto a serializa y deserializa: ");
        final String DIRECTORIO = input.nextLine();

        //Ejemplo ->   C:/Users/admin/IdeaProjects/cursoJavaItAcademy11Marzo2024/sprint1_javaLanguage/src/tasca5_javaUtils/n1exercici5/Objeto.ser

        Objeto objeto = new Objeto();

        SerializarObjetoJava serializaDodeserializarObjeto = new SerializarObjetoJava();
        serializaDodeserializarObjeto.serializarObjeto(DIRECTORIO, objeto);
        serializaDodeserializarObjeto.deserializarObjeto(DIRECTORIO, Objeto.class);

    }
}