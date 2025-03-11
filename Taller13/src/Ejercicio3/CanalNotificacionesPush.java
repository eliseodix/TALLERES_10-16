
package Ejercicio3;


public class CanalNotificacionesPush implements CanalEnvio{
     @Override
     public void enviar(String destinatario, String mensaje){
         System.out.println("ENVIANDO MENSAJE A::" + destinatario);
         System.out.println("MENSAJE::" + mensaje);
     }
    
}
