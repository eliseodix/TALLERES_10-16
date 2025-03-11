
package Ejercicio2;


public class Prueba {
    public static void main(String[] args) {
        CuentaBancaria cuneta = new CuentaBancaria(1000);
        cuneta.depositar(500);
        cuneta.retirar(300);
        System.out.println("SALDO DE LA CUENTA BANCARIA : $" + cuneta.consultaSalario());
        
        CunetoAhorro cuentaAhorros = new CunetoAhorro(2000, 5);
        cuentaAhorros.depositar(500);
        cuentaAhorros.aplicarInteres();
        System.out.println("SALDO DE AHORROS DESPUES DE INTERESES: $"+cuentaAhorros.consultaSalario());
    }
    
}
