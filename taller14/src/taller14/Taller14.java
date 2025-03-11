
package taller14;


public class Taller14 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Figura circulo = new Circulo(5);
        System.out.println("EL AREA DEL CIRCULO ES::" +circulo.calcularArea());
        
        Figura rectangulo = new Rectangulo(24, 5);
        System.out.println("EL AREA DEL RECTANGULO ES::" +rectangulo.calcularArea());
        
        
    }
    
}
