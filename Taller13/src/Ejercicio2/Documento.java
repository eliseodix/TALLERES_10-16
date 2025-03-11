
package Ejercicio2;


public class Documento {
    private String contenido;
    private Exportar exportador;

    public Documento(String contenido, Exportar exportador) {
        this.contenido = contenido;
        this.exportador = exportador;
    }

    
    
    public void exportador(){
        exportador.exportar(contenido);
    }
    
}
