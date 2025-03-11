
package taller16;


public class GestorAutenticacion {
    
    private ServicioAutenticacion servicioAU;

    public GestorAutenticacion(ServicioAutenticacion servicioAU) {
        this.servicioAU = servicioAU;
    }
    public void autenticarUsuario(String usuario, String clave){
        boolean exit= servicioAU.autenticar(usuario, clave);
        if(exit){
            System.out.println("EL USUARIO FUE AUTENTICADO");
        }else{
            System.out.println("ERROR AL AUTENTICAR EL USUSARIO");
        }
    }
    
    
    
}
