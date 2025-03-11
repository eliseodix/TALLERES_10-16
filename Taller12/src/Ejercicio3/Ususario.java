
package Ejercicio3;


public class Ususario {

    public String getNombre() {
        return nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getGmail() {
        return gmail;
    }


    private String nombre;
    private String contraseña;
    private String gmail;

    public Ususario(String nombre, String contraseña, String gmail) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.gmail = gmail;
    }
     
    

}
