
package Ejercicio3;


public class CanalSMS implements CanalEnvio{
     @Override
     public void enviar(String destinatario, String mensaje){
         System.out.println("ENVIANDO SMS::" + destinatario);
         System.out.println("MENSAJE::"+mensaje);
     }
    
    
    
}
