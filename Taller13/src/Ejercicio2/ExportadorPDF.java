
package Ejercicio2;


public class ExportadorPDF implements Exportar{
    
    @Override
    public void exportar(String contenido){
        System.out.println("EXPORTANDO PDF::" + contenido);
    }
    
}
