
package Ejercicio3;


public class Prueba {
    public static void main(String[] args) {
        
        Transporte bici = new Bicicleta();
        Transporte coche = new Coche();
        
        bici.mover();
        bici.detener();
        System.out.println("/////////////////");
        coche.mover();
        coche.detener();
    }
    
}
