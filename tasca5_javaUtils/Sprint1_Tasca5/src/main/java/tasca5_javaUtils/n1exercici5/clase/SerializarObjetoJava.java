package tasca5_javaUtils.n1exercici5.clase;

import java.io.*;

public class SerializarObjetoJava {

        public boolean serializarObjeto(String direcionArchivo, Serializable objeto) {
            boolean estado = false; //El estado de la operación de serialización del objeto en el archivo de salida
            try (FileOutputStream fos = new FileOutputStream(direcionArchivo); //Ruta de fichero al que se va a escribir el objeto
            ObjectOutputStream salida = new ObjectOutputStream (fos);) {  //El objeto a serializar
                salida.writeObject(objeto); //Se escribir el objeto en el archivo de la ruta dada
                estado = true; //Cambiamos el estado a true si se ha podido serializar el objeto
            } catch (Exception e) {
                e.printStackTrace();
            }
            return estado;
        }


    //La Clase <E> es generica que acepte cualquier tipo de objeto que se debe a deserializar
        public <E> E deserializarObjeto(String direcionArchivo, Class<E> clasObjetivo) {
            E objeto = null; //El Objeto que devolvería el deserializado de la clase generica  <E>
            try (FileInputStream fis = new FileInputStream(direcionArchivo); //RutaFichero de entrada que se va a leer el objeto a deserializar
                 ObjectInputStream entrada = new ObjectInputStream(fis);) { // El objeto a deserializar
                objeto = (E) entrada.readObject(); //El Objeto optenido de la clase generica <E>
                System.out.println(objeto.toString());
            } catch (Exception e) { //En caso de que no se pueda deserializar el objeto se lanza una excepción
                e.printStackTrace();
            }
            return objeto;
        }

}