import java.util.List;
import java.util.ArrayList;

public class Cliente {

    public static void main(String[] args) {

        List<ArchivoDeTexto> archivosGuardados = new ArrayList<ArchivoDeTexto>();

        EditorDeTexto editor = new EditorDeTexto();

        editor.agregarTexto("The Memento Design Pattern\n");
        editor.agregarTexto("How to implement it in Java?\n");
        editor.mostrarTexto();
        ArchivoDeTexto archivo = editor.guardarArchivo();
        archivosGuardados.add(archivo);
        editor.agregarTexto("Buy milk and eggs before coming home\n");
        editor.mostrarTexto();
        archivo = archivosGuardados.get(0);
        editor.abrirArchivo(archivo);
        editor.mostrarTexto();
    }

}
