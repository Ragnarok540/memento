// Clase "Originator"
public class EditorDeTexto {
 
    private StringBuilder textoActual;
 
    public EditorDeTexto() {
        this.textoActual = new StringBuilder();
    }

    public void agregarTexto(String texto) {
        this.textoActual.append(texto);
    }

    public void mostrarTexto() {
        System.out.println("Editor:");
        System.out.println("----------------------------------------");
        System.out.println(this.textoActual.toString());
        System.out.println("----------------------------------------");
    }

    public ArchivoDeTexto guardarArchivo() {
        return new ArchivoDeTexto(this.textoActual.toString());
    }

    public void abrirArchivo(ArchivoDeTexto textoGuardado) {
        this.textoActual = new StringBuilder(textoGuardado.getTexto());
    }

}
