
package Ejercicio2;


public class Producto {

    public String getNombre() {
        return nombre;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public double getPrecio() {
        return precio;
    }
    private String nombre;
    private double precio;
    private double impuestos;
    public Producto(String nombre, double precio, double impuestos) {
        this.nombre = nombre;
        this.precio = precio;
        this.impuestos = impuestos;
    } 
    
   
    
}
