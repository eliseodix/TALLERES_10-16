
package Ejercicio2;


public interface OperacionesBancarias {
    public void realizarTransferencia(String destinatario, double monto);
    public void realizarRetiro(double monto);
    public void realizarPagoFactura(String servicio, double monto);
    
}
