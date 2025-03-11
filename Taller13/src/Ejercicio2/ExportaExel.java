
package Ejercicio2;


public class ExportaExel implements Exportar{
    
    @Override
    public void exportar(String contenido){
        System.out.println("EXPORTANDO EXCEL::"+contenido);
    }
    
    
}
