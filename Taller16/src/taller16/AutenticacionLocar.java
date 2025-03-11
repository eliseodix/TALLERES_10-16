
package taller16;


public class AutenticacionLocar implements ServicioAutenticacion{

    @Override
    public boolean autenticar(String usuario, String clave) {
        if(usuario.equals("eliseo") && clave.equals("1234")){
            System.out.println("AUTENTICACION LOCAL EXITOSA");
        
        return true;
    }
        System.out.println("AUTENTICACION FALLIDA");
        return false;

    }
}