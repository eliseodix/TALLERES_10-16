
package prueba;





public class Prueba {

   
    public static void main(String[] args) {
        // TODO code application logic here
       
      
        Rectangulo rectangulo = new Rectangulo(24,5);
        Triangulo triangulo = new Triangulo(34, 6);
        
        System.out.println("EL AREA DEL RECTANGULO ES =" +rectangulo.calcularArea());
        System.out.println("///////////////////////////////////////////////////////");
        System.out.println("EL AREA DEL TRIANGULO ES ="+ triangulo.calcularArea());
    }
    
}
