import java.util.*;

// Clase "Caretaker"
public class Archivador {

    // Colección que almacenará los archivos en memoria
    private HashMap<String, ArchivoDeTexto> archivos;

    public Archivador() {
        this.archivos = new HashMap<>();
    }

    public void guardar(String nombre, ArchivoDeTexto archivo) {
        this.archivos.put(nombre, archivo);
    }

    public ArchivoDeTexto abrir(String nombre) {
        return this.archivos.get(nombre);
    }

}
