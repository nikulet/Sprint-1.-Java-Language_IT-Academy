package n1exercici3.play;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Play {

    byte scorTotal = 0;
    String nombreUsuariio = "", paisElejidoRandom = "", capitalUsuario = "";

    public byte getScorTotal() {
        return scorTotal;
    }

    public void setScorTotal(byte scorTotal) {
        this.scorTotal = scorTotal;
    }

    public String getNombreUsuariio() {
        return nombreUsuariio;
    }

    public void setNombreUsuariio(String nombreUsuariio) {
        this.nombreUsuariio = nombreUsuariio;
    }

    Scanner entrada = new Scanner(System.in);
    private final HashMap<String, String> datosGuardados = new HashMap<>();
    Random paisAliatorio = new Random();

    public HashMap<String, String> guardarDatos() {

        String filepath = "src/main/java/n1exercici3/txt/countries.txt";
        try (FileReader texto = new FileReader(filepath)) {
            BufferedReader readText = new BufferedReader(texto);
            // Lectura del fichero
            String linea;
            while ((linea = readText.readLine()) != null) {
                if(linea.contains(" ")) {
                    String[] lineArray = linea.split(" ", 2);
                    lineArray[0] = lineArray[0].replace('_', ' ').trim();
                    lineArray[1] = lineArray[1].replace('_', ' ').trim();
                    datosGuardados.put(lineArray[0], lineArray[1]);
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return datosGuardados;
    }


    //Metodo personalizado creear archivo txt
    public void crearArchivoPuntacionUsuario() {
        try{
            File archivoTxt = new File("src/main/java/n1exercici3/txt/classificacio.txt");
            if(archivoTxt.createNewFile()) { //Comprobacion de crear un nuevo archivo txt en caso que existe y en caso que no existe
                System.out.println("Archivo creado " + archivoTxt.getName()); //En caso que no existe en la carpeta el archivo classificacio.txt lo va a crear
            } else {
                System.out.println("El Archivo "  + archivoTxt.getName() + " ya existe"); //En caso que existe en la carpeta el archivo classificacio.txt no lo va a crear,por que ya esta creado
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al crear el archivo");
        }

    }

    //Metodo personalizado llenar el  archivo txt con datos , exactamente con el nombre del jugador y la puntuacion que a optenido
    public void agregarRegistroPuntacion() {
        try {
            FileWriter archivoTxt = new FileWriter("src/main/java/n1exercici3/txt/classificacio.txt", true);
            archivoTxt.write(getNombreUsuariio() + " puntuacion: " + getScorTotal());
            archivoTxt.write("\n");
            archivoTxt.close();
        } catch (Exception e) {
            JOptionPane.showInputDialog(null, "Ocurrio un error al registrar");
        }

    }

    //Metodo personalizado para jugar en acertar la capital de un pais
    public void playApp(HashMap<String, String> guardarDatos) {
        List<String> capitalas = new ArrayList<>(guardarDatos.values()); //Lista capitalas
        List<String> paises = new ArrayList<>(guardarDatos.keySet());//Lista paises

        System.out.println("Por favor, escribe tu nombre:");
        nombreUsuariio = entrada.nextLine();

        for(int i = 0; i < 10; i++) {

            int longitud = paisAliatorio.nextInt(guardarDatos.size());
            paisElejidoRandom = paises.get(longitud);
            System.out.print((i + 1) + ". Escribe el nombre de la capital del país " + paisElejidoRandom.toUpperCase() + " : ");
            capitalUsuario = entrada.nextLine();

            if (capitalUsuario.equalsIgnoreCase(capitalas.get(longitud))) {
                System.out.println("Respuesta correcta. Has ganado un punto!");
                scorTotal++;
            } else {
                System.out.println("Respuesta incorrecta. No has ganado nada! La respuesta correcta es: " + capitalas.get(longitud));
            }

        }

        crearArchivoPuntacionUsuario(); //Este metodo creea el archivo txt en el cual se va anadir informacion con el metodo agregarRegistroPuntacion();

        agregarRegistroPuntacion(); //Metodo que agrega en fichero txt el nombre del usuario y la puntuacion que a optenido el jugador

        System.out.println("\nResultado optenido por " + nombreUsuariio.toUpperCase() + " es: " + scorTotal + " puntos.");

    }


}