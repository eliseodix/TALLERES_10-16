
package Ejercicio2;


public class PPrueba {
    public static void main(String[] args) {
         
        CajeroAutmatico CA = new CajeroAutmatico();
        AppMovilNequi AMN = new AppMovilNequi();
        System.out.println("////////APP NEQUI////////////");
        AMN.realizarRetiro(3000);
        System.out.println("///////Pago factura/ APP NEQUI/////////////");
        AMN.realizarPagoFactura("NEQUI", 120000);
        System.out.println("////Transferencia/ APP NEQUI/////////////////////");
        AMN.realizarTransferencia("3028657107", 1230000);
        System.out.println("//////////Cajero automatico//////////////////");
        System.out.println("///////Transferencia//////////////");
        CA.realizarTransferencia("123-5444-67", 20000);
        System.out.println("////////////Retiro//////////////////");
        CA.realizarRetiro(2000);
        
    }
    
}
