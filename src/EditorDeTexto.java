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
        System.err.println(this.textoActual.toString());
        System.out.println("----------------------------------------");
    }

    public ArchivoDeTexto guardarArchivo() {
        System.out.println("Editor: Guardando Archivo...");
        System.out.println("----------------------------------------");
        return new ArchivoDeTexto(this.textoActual.toString());
    }

    public void abrirArchivo(ArchivoDeTexto textoGuardado) {
        System.out.println("Editor: Abriendo Archivo...");
        System.out.println("----------------------------------------");
        this.textoActual = new StringBuilder(textoGuardado.getTexto());
    }

}
