import java.io.Serializable;

/**
 * Clase que representa una persona y es serializable para su almacenamiento en archivos.
 * @author Campos Mendoza Edgar Felipe
 * @author Fuentes Esquivel Elian Andrea
 */
public class Persona implements Serializable {
    // Identificador único de versión para garantizar la compatibilidad en la serialización
    private static final long serialVersionUID = 1L;

    // Atributos de la clase Persona
    private String nombre;
    private int edad;

    /**
     * Constructor para inicializar los atributos de la clase Persona.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Sobrescritura del método toString para representar el objeto como una cadena.
     * 
     * @return Representación en cadena del objeto Persona.
     */
    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + '\'' + ", edad=" + edad + '}';
    }
}
