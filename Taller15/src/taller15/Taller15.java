
package taller15;


public class Taller15 {

  
    public static void main(String[] args) {
        // TODO code application logic here
        HaceReparacion mecanico = new Mecanico();
        HaceLimpiesa ayudanteMecanico = new AyudanteDelMecanico();
        TecnicoProfesional tecnico = new TecnicoProfesional();
        
        mecanico.reparando();
        System.out.println("//////////////////////");
        ayudanteMecanico.linpiando();
        System.out.println("//////////////////////");
        tecnico.reparando();
        tecnico.linpiando();
        
    }
    
}
