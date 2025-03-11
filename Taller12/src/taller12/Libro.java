
package taller12;


public class Libro {
       private String titulo;
    private String autor;
    private int añoLanzamineto;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoLanzamineto() {
        return añoLanzamineto;
    }

    public Libro(String titulo, String autor, int añoLanzamineto) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoLanzamineto = añoLanzamineto;
    }
    public String informacion(){
        return titulo + "\nESCRITO POR=" + autor + "\nEN EL AÑO=" + añoLanzamineto; 
    }
    
}
