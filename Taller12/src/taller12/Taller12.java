
package taller12;


public class Taller12 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Libro M = new Libro("ARSEN LUPAN","ANONIMO", 1998);
        ReporteLibro R = new ReporteLibro();
        R.reporteLibro(M);
        
        PersistenciaLibro P = new PersistenciaLibro();
        P.guardarLibro(M);
        
    }
    
}
