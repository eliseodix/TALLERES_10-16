
package Ejercicio2;


public class AlmacenaminetoLocal implements Almacenamineto{

    @Override
    public void guardarArchivo(String nombre, String contenido) {
        System.out.println("NOMBRE DEL ARCHIVO::"+nombre + "\nCONTENIDO DEL ARCHIVO::"+contenido);
        
    }

    @Override
    public String recuperarArchivo(String nombre) {
        
        return "|||RECUPERANDO ARCHIVO LOCAL::"+nombre;
    }
    
    

    
  

    
    
    
    
}
