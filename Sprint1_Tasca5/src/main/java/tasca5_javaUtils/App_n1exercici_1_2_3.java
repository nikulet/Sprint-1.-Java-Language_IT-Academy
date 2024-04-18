package tasca5_javaUtils;

import tasca5_javaUtils.n1exercici1.Ordenar;
import tasca5_javaUtils.n1exercici2.ArboresNiveles;
import tasca5_javaUtils.n1exercici3.GuardarEnTxt;
import java.util.Scanner;

public class App_n1exercici_1_2_3 {
    public static void main(String[] args)  {

        Scanner input = new Scanner(System.in);
        System.out.println("Escribe la ruta que quieres aceder: ");
        final String DIRECTORIO = input.nextLine();

        //Ejemplo ->   C:\Users\admin\IdeaProjects\Sprint1_Tasca5\src\main\java\tasca5_javaUtils\docx

        System.out.println("""
                ******************  Taska 5 n1exercicio1  *******************
                """);
        Ordenar lister = new Ordenar();
        lister.listFilesInDirectory(DIRECTORIO);

        System.out.println("""
                \n******************  Taska 5 n1exercicio2  *******************
                """);
        ArboresNiveles arboresNiveles = new ArboresNiveles();
        arboresNiveles.mostrarDatos(DIRECTORIO);

        System.out.println("""
                \n******************  Taska 5 n1exercicio3  *******************
                Revizar el archivo txt con datos guardados en directorio n1exercici3
                """);
        GuardarEnTxt arboresNiveles1 = new GuardarEnTxt();
        arboresNiveles1.guardar(DIRECTORIO); //llama al método guardar datos en un archivo nuevo txt
    }
}