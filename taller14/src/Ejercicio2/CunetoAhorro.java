
package Ejercicio2;


public class CunetoAhorro extends CuentaBancaria{
  protected double tasaInteres;

    public CunetoAhorro(double saldoInicial, double tasaInteres ) {
        super(saldoInicial);
        if(tasaInteres <0){
            throw new IllegalArgumentException("LA TASA DE INTERESES NO PUEDE SER NEGATIVA");
        }
        this.tasaInteres = tasaInteres;
    }

   public void aplicarInteres(){
       if (tasaInteres >0){
        saldo += saldo * (tasaInteres )/100;
       }
   }
  }
  

