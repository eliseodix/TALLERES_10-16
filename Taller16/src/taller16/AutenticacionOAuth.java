
package taller16;


public class AutenticacionOAuth implements ServicioAutenticacion{

    @Override
    public boolean autenticar(String usuario, String clave) {
    System.out.println("AUTENTICACION OAUTH REALIZADA"
            + " PARA EL USUARIO: " + usuario);
        return true;
    }
    
    
    
}
