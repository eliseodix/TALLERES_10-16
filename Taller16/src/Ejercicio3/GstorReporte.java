
package Ejercicio3;


public class GstorReporte {
    private GeneradorReporte GR;

    public GstorReporte(GeneradorReporte GR) {
        this.GR = GR;
    }
    
    public void generarReporte(String contenido){
        GR.generar(contenido);
    }
    
}
