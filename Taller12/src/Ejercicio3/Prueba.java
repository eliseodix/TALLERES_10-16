
package Ejercicio3;

import javax.swing.JOptionPane;


public class Prueba {
    public static void main(String [] args){
    
        
      Ususario usuario = new Ususario("Eliseo", "123", "eliseo@gmail.com");
      ValidacionGmail m = new ValidacionGmail();
      validacionAutenticacion P = new validacionAutenticacion();
      
      if(m.validar(usuario.getGmail())){
          System.out.println("VALIDACION CORRECTA");
          System.out.println("GMAIL = "+usuario.getGmail());
         
      }else{
          System.out.println("NO SE HIZO LA VALIDACION");
        
          System.out.println("GMAIL DEBE TENER @ Y .");
         
      }
        
       if (P.autenticacion(usuario, "123")){
           System.out.println("SI SE HIZO LA VALIDACION");
            System.out.println("BIENVENIDO="+usuario.getNombre());
       }else{
           System.out.println("NO SE HIZO LA VALIDACION");
       } 
        
    }
    
}
