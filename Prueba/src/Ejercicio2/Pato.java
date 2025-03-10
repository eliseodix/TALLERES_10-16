
package Ejercicio2;


public class Pato implements Volador, Nadador{
    
    @Override
    public void volar(){
        System.out.println("EL PATO ESTA VOLANDO");
        
        
    }
    @Override
    public void nadar(){
        System.out.println("EL PATO ESTA NADANDO");
    }
    
}
