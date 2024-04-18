/* ex2-ex4: el método mostrarDatos() realiza demasiadas tareas. Intenta rafactorizar.*/

package tasca5_javaUtils.n1exercici4;

import tasca5_javaUtils.n1exercici4.clase.TxtDatos;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Escribe la ruta a la que quieres aceder: ");
        final String DIRECTORIO = input.nextLine();

        //Ejemplo ->   C:\Users\admin\IdeaProjects\Sprint1_Tasca5\src\main\java\tasca5_javaUtils\docx

        System.out.println("\n**************************************  Tasca 5 n1exercicio4  ************************************\n");
        TxtDatos arboresNiveles = new TxtDatos();
        arboresNiveles.mostrarDatos(DIRECTORIO);
    }

}