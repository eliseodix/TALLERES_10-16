
package Ejercicio3;


public class CanalCorreo implements CanalEnvio{
    @Override
    public void enviar(String destinario ,String mensaje){
        System.out.println("ENVIANDO CORREO A ::" +destinario);
        System.out.println("MENSAJE::"+mensaje);
    }
    
    
}
