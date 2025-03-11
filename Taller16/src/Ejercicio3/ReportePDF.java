
package Ejercicio3;


public class ReportePDF implements GeneradorReporte{

    @Override
    public void generar(String contenido) {
        System.out.println("GENERANDO REPORTE EN  PDF");
        System.out.println(contenido);
    }
    
    
}
