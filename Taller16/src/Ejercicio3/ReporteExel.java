
package Ejercicio3;


public class ReporteExel implements  GeneradorReporte{

    @Override
    public void generar(String contenido) {
        System.out.println("GENERANDO REPORTE EN EXCEL");
        System.out.println(contenido);
    }
    
}
