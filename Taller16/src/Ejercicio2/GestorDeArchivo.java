
package Ejercicio2;


public class GestorDeArchivo {
    
    private Almacenamineto almacenamiento;

    public GestorDeArchivo(Almacenamineto almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    public void guardar(String nombre, String contenido){
        almacenamiento.guardarArchivo(nombre, contenido);
    }
    public void recuperar(String nombre){
       String contenido= almacenamiento.recuperarArchivo(nombre);
        System.out.println("||CONTENIDO DEL ARCHIVO//" +nombre+ "/"+"\nCONTENIDO::"+contenido);
                
    }
    
}
