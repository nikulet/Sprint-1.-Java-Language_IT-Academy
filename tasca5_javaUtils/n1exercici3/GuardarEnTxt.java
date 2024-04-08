package tasca5_javaUtils.n1exercici3;

import tasca5_javaUtils.n1exercici2.ArboresNiveles;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarEnTxt {
    public void guardar(String ruta) {
        File directorio = new File(ruta);
        File archivoTxt = new File("C:/Users/admin/IdeaProjects/cursoJavaItAcademy11Marzo2024/sprint1_javaLanguage/src/tasca5_javaUtils/n1exercici3/listado.txt");

        // Creo un objeto BufferedWriter para escribir la informacion en el archivo de texto listado.txt y que puede traer una excepción
        try (BufferedWriter ignored = new BufferedWriter(new FileWriter(archivoTxt))) {
            System.setOut(new java.io.PrintStream(archivoTxt));

            ArboresNiveles arboresNiveles = new ArboresNiveles();
            arboresNiveles.mostrarDatos(ruta);  // llama al método mostrarDatos para copiar los datos en el archivo  listado.txt
        } catch (IOException e) {
            System.out.println("Error al guardar los datos en el archivo: " + e.getMessage());
        }
    }

}