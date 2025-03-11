
package Ejercicio2;


public class CajeroAutmatico implements Transferencia, Retiross{

    @Override
    public void realizarTransferencia(String destinatario, double monton) {
        
        System.out.println("TRANSFERENCIA A||" + destinatario + "|\nTRNASFERENCIA MONTO $" + monton);
    }
    
    

    @Override
    public void realizarRetiro(double monto) {
        System.out.println("RETIRO MONTO $"+monto);
    }
 
}
