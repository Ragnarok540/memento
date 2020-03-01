import java.util.*;

public class Cliente {

    public static void main(String[] args) {

        // Colección que almacenará los archivos en memoria
        HashMap<String, ArchivoDeTexto> archivos = new HashMap<>();

        // Instancia del "Originator"
        EditorDeTexto editor = new EditorDeTexto();

        // Agregamos un par de líneas al editor y mostramos el texto
        editor.agregarTexto("El patrón de diseño Memento\n");
        editor.agregarTexto("¿Cómo implementarlo en Java?\n");
        editor.mostrarTexto();

        // Usamos el método del editor que crea una nueva instancia del
        // "Memento" y lo agregamos a la colección
        ArchivoDeTexto archivo = editor.guardarArchivo();
        archivos.put("archivo_0", archivo);

        // Agregamos una nueva línea al editor y mostramos el texto
        editor.agregarTexto("Esta línea no será guardada\n");
        editor.mostrarTexto();

        // Abrimos el archivo guardado obteniendo el "Memento"
        // y pasandolo al método que restaura el estado del "Originator"
        archivo = archivos.get("archivo_0");
        editor.abrirArchivo(archivo);

        // Mostramos el texto y verificamos que la última línea no fue
        // almacenda. Esto es equivalente a cerrar el editor sin guardar
        // o usar una función "deshacer".
        editor.mostrarTexto();

        // Agregamos una nueva línea al editor y mostramos el texto
        editor.agregarTexto("Esta línea si será guardada, pero en otro archivo\n");
        editor.mostrarTexto();

        // Guardamos un segundo archivo
        archivo = editor.guardarArchivo();
        archivos.put("archivo_1", archivo);

        // Nuevamente abrimos el primer archivo y lo mostramos
        archivo = archivos.get("archivo_0");
        editor.abrirArchivo(archivo);
        editor.mostrarTexto();

        // Por último mostramos el segundo archivo guardado
        archivo = archivos.get("archivo_1");
        editor.abrirArchivo(archivo);
        editor.mostrarTexto();

    }

}
