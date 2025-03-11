
package Ejercicio2;


public class GeneradorEtiqueta {
    public static String GenerarTikect(Producto producto){
        
        return "PRODUCTO = "+ producto.getNombre()+ "\n|PRECIO $ = "+producto.getPrecio();
        
    }
    
}
