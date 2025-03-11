
package taller16;


public class Taller16 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioAutenticacion local= new AutenticacionLocar();
        GestorAutenticacion gesLocal = new GestorAutenticacion(local);
        gesLocal.autenticarUsuario("eliseo", "1234");
        
        ServicioAutenticacion oauth = new AutenticacionOAuth();
        GestorAutenticacion gesOAuth = new GestorAutenticacion(oauth);
        gesOAuth.autenticarUsuario("fer", "321");
    }
    
}
