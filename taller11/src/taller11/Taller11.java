
package taller11;


public class Taller11 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Figura figura1= new Circulo(4);
        Figura figura2 = new Rectangulo(24, 5);
        Figura p = new Figura();
        
        p.calcularArea();
        figura1.calcularArea();
        figura2.calcularArea();
    }
    
}
