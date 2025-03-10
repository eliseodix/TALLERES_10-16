
package taller11;


public class Circulo extends Figura{
    public double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
     public void calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El AREA DE CIRCULO ES="+ area);
        
         
       
     }
   
    
    
    
}
