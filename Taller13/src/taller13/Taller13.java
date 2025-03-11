
package taller13;

import java.beans.Introspector;


public class Taller13 {

  
    public static void main(String[] args) {
        // TODO code application logic here
       // Crear un descuento porcentual
        Descuento descuento = new Descuento(10); // 10% de descuento
        double porcentaje = descuento.aplicarDescuento(100); // Aplicar al precio base de $100
        System.out.println("PRECIO CON DESCUENTO PORCENTAJE: $" + porcentaje);

        // Crear un descuento fijo
        DescunetoFijo fijo = new DescunetoFijo(200); // Descuento fijo de $200
        double porcentajeEstatico = fijo.aplicarDescuento(1000); // Aplicar al precio base de $1000
        System.out.println("PRECIO DESCUENTO FIJO: $" + porcentajeEstatico);
    }
}
