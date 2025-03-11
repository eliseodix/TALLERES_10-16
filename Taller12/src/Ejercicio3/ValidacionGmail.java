
package Ejercicio3;


public class ValidacionGmail {
    
    public boolean validar(String gmail){
        
        return gmail.contains("@") && gmail.contains(".");
        
    }
    
}
