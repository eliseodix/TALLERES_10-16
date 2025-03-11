
package Ejercicio2;


public class AppMovilNequi implements Retiross, FacturaPago, Transferencia{

    @Override
    public void realizarRetiro(double monto) {
          System.out.println("RETIRO MONTO $"+monto);
    }

    @Override
    public void realizarPagoFactura(String servicio, double monto) {
        System.out.println("SERVICIO|| " +servicio+ "|\nPAGO MONTO $"+monto);
    }

    @Override
    public void realizarTransferencia(String destinatario, double monto) {
        System.out.println("TRANFERIR A ||" + destinatario +"|\nTRANSFERENCIA MONTO $"+ monto);
        
    }
     
    
    
    
}
