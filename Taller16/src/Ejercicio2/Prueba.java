
package Ejercicio2;


public class Prueba {
    public static void main(String[] args) {
        Almacenamineto local = new AlmacenaminetoLocal();
        GestorDeArchivo GLocal = new GestorDeArchivo(local);
        GLocal.guardar("arroz", "granos");
        GLocal.recuperar("arroz");
        
        Almacenamineto nuve = new AlmacenmientoNuve();
        GestorDeArchivo Gnuve = new GestorDeArchivo(nuve);
        Gnuve.guardar("las estrellas", "hastros");
        Gnuve.recuperar("las estrelllas");
                
                
                
    }
    
}
