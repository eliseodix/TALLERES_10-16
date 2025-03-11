
package Ejercicio3;


public class Prueba {
    public static void main(String[] args){
        CanalEnvio canalCorreo = new CanalCorreo();
        Mensajero MC = new Mensajero(canalCorreo);
        MC.enviarMensaje("eliseo@gmail.com", "hola, campeon");
        
        CanalEnvio canalSMS = new CanalSMS();
        Mensajero MSMS = new  Mensajero(canalSMS);
        MSMS.enviarMensaje("30289343", "TE HAS GANADO UNA CASA");
        
        CanalEnvio canalPush = new CanalNotificacionesPush();
        Mensajero MPUSH = new Mensajero(canalPush);
        MPUSH.enviarMensaje("FREDI", "NO LO SOLICITO PERO TIENES QUE PAGAR AL BANCO");
        
        
       
    }
    
}
