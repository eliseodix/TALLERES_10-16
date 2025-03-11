
package Ejercicio2;


public class AlmacenmientoNuve implements Almacenamineto{

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("GUARDANDO EN LA NUEVE::"+nombre+ "CONTENIDO::"+contenido );
        
    }

    @Override
    public String recuperarArchivo(String nombre) {
        return "|||RECUPERANDO ARCHIVO DE LA NUEVE::"+nombre;

    }
    
    
    
}
