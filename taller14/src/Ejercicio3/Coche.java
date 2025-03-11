
package Ejercicio3;


public class Coche extends Transporte{
    
    @Override
    public void mover(){
        System.out.println("EL COCHE SE ESTA MOVIENDO");
    }

    @Override
    public void detener() {
        System.out.println("EL COCHE SE DETIENE DE REPENTE");
        
    }
    
}
