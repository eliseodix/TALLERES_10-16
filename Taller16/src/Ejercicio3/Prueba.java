
package Ejercicio3;


public class Prueba {
    public static void main(String[] args) {
        ReportePDF PDF = new ReportePDF();
        GstorReporte GPDF = new GstorReporte(PDF);
        GPDF.generarReporte("EL AGUA MOJA");
        
        ReporteExel Excel= new ReporteExel();
        GstorReporte GExcel = new GstorReporte(Excel);
        GExcel.generarReporte("buenas noches ufff");
    }
}
