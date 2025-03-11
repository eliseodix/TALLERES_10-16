
package taller13;


public class DescunetoFijo extends Descuento{

    public double getMontonfijo() {
        return montonfijo;
    }
    
    private double montonfijo;

    public DescunetoFijo(double montonfijo) {
        super(0);
        this.montonfijo = montonfijo;
        
        
    }
    @Override
   public double aplicarDescuento(double precio){
       
       return precio - montonfijo;
       
        
    }
  
}
