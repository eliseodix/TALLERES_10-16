
package Ejercicio2;


public class Prueba {
    public static void main(String[] args){
        Producto Pro = new Producto("manzana", 0.14, 2000);
       
        double precifin= CalcularPrecio.clacularPrecioFinal(Pro);
        System.out.println("EL PRECIO ES $" + precifin);
        
        String generar= GeneradorEtiqueta.GenerarTikect(Pro);
        System.out.println(generar);
        
        
    }
    
}
