import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

/**
 * Clase que demuestra cómo serializar un objeto de la clase Persona y almacenarlo en un archivo.
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class Serializar {
    public static void main(String[] args) {
        // Crear un objeto Persona con datos de ejemplo
        Persona persona = new Persona("Juan", 30);

        // Bloque try-with-resources para gestionar el archivo automáticamente
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
            // Escribir el objeto en el archivo
            oos.writeObject(persona);
            System.out.println("Objeto serializado correctamente.");
        } catch (IOException e) {
            // Manejo de posibles errores durante la serialización
            e.printStackTrace();
        }
    }
}
