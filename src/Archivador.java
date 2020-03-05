import java.util.*;

// Clase "Caretaker"
public class Archivador {

    // Colección que almacenará los archivos en memoria
    private HashMap<String, ArchivoDeTexto> archivos;

    public Archivador() {
        this.archivos = new HashMap<>();
    }

    public void guardar(String nombre, ArchivoDeTexto archivo) {
        System.out.println("Guardando archivo: " + nombre);
        System.out.println("----------------------------------------");
        this.archivos.put(nombre, archivo);
    }

    public ArchivoDeTexto abrir(String nombre) {
        System.out.println("Abriendo archivo: " + nombre);
        System.out.println("----------------------------------------");
        return this.archivos.get(nombre);
    }

}
