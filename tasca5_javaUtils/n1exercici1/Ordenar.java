package tasca5_javaUtils.n1exercici1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Ordenar {

    //Metodo personalizado para ordenar los archivos en orden alfabético del directorio recibido por parámetro
    public void listFilesInDirectory(String ruta) {

        try {

            File[] archivos = datosRuta(ruta);

        Arrays.sort(archivos);  // Se ordena la matriz de archivos en orden alfabético
        System.out.println("Lista de los archivos del directorio en orden alfabético: ");
        for (File archivo : archivos) { // Se recorre la matriz de archivos y se imprimen los nombres de los archivos
            System.out.println(archivo.getName());
        }

        } catch (FileNotFoundException e) {
            System.out.println("\n" +e.getMessage());
        }

    }

    private static File[] datosRuta(String ruta) throws FileNotFoundException {
        File directorio = new File(ruta); // Se crea un objeto de tipo File con la ruta proporcionada por parámetro

        if (!directorio.exists() || !directorio.isDirectory()) { //Se comprueba que el directorio exista y sea un directorio
            throw new FileNotFoundException("Error!!! La ruta del directorio no existe o no es válida");
        }

        // Se obtienen los archivos del directorio recibido por parámetro y se almacenan en un arreglo de archivos
        File[] archivos = directorio.listFiles();
        if (archivos == null || archivos.length == 0) { // Si la matriz de archivos es nula, se sale del método returnando el mensaje de error
            throw new FileNotFoundException("Error!!! No se pueden listar los archivos del directorio. Directorio vacío o sin archivos");
        }
        return archivos;
    }


}