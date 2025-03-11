package Ejercicio2;





public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldoInicial) {
        if(saldoInicial<0){
            throw new IllegalArgumentException("EL SALDO INICIAL NO PUEDE SER NEGATIVO");
        }
        this.saldo = saldoInicial;
    }
    
    public void depositar(double monto){
        if (monto>0){
            saldo += monto;
        }else{
            throw  new IllegalCallerException("EL MONTON DEBE SER NEGATIVO");
            
        }
    }
    public void retirar(double monto){
        if(monto >0 && monto <= saldo){
            saldo-= monto;
        }else{
            throw new IllegalStateException("MONTON INVALIDO PARA RETIRAR");
                    
        }
    }
         public double consultaSalario(){
             return saldo;
         }  
}
