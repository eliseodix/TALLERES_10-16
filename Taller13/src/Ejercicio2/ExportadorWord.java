
package Ejercicio2;


public class ExportadorWord implements Exportar{
    
    @Override
    public void exportar(String contenido){
        System.out.println("EXPORTANDO WORD::"+ contenido);
        
    }

}
