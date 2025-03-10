
package Error;


public class PruebaError {
    // Clase de prueba

    public static void main(String[] args) {
        Figura figura = new Circulo(); // Polimorfismo: referencia de Figura, objeto de Circulo

        // Invocación del método de la clase base esto es válido
        figura.calcularArea();

        // Intento de invocar un método exclusivo de la clase derivada
        // figura.mostrarRadio(); // Error de compilación: el método no es visible en la referencia de la clase base
    }
}

