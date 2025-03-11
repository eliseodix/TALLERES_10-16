
package Ejercicio3;


public class Mensajero {
  private CanalEnvio caEn;

    public Mensajero(CanalEnvio caEn) {
        this.caEn = caEn;
    }
  
  public void enviarMensaje(String destinatario, String mensaje){
      caEn.enviar(destinatario, mensaje);
      
  }
        
    
   
}
