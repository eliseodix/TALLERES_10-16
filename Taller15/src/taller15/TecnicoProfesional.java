
package taller15;


public class TecnicoProfesional implements HaceReparacion, HaceLimpiesa{

    @Override
    public void reparando() {
        System.out.println("EL TECNICO PROFECIONAL REPARA");
    }

    @Override
    public void linpiando() {
        System.out.println("EL TECNICO PROFESIONAL LIMPIA");
    }
    
    
    
}
