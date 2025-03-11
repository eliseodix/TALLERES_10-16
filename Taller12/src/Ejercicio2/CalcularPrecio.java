
package Ejercicio2;


public class CalcularPrecio {
    public static double clacularPrecioFinal(Producto producto){
        
        return (producto.getPrecio() * producto.getImpuestos());
    }
    
}
