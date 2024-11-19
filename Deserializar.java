import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;

/**
 * Clase que demuestra cómo deserializar un objeto almacenado en un archivo.
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class Deserializar {
    public static void main(String[] args) {
        // Bloque try-with-resources para abrir y cerrar el archivo automáticamente
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.dat"))) {
            // Leer el objeto del archivo y hacer el casting al tipo Persona
            Persona persona = (Persona) ois.readObject();
            // Mostrar el objeto recuperado
            System.out.println("Objeto deserializado: " + persona);
        } catch (IOException | ClassNotFoundException e) {
            // Manejo de posibles errores durante la deserialización
            e.printStackTrace();
        }
    }
}
