
package Ejercicio2;


public class Prueba {
    public static void main(String[] args){
        ExportadorPDF PDF = new ExportadorPDF();
        Documento documento = new Documento("ESTE ES UN DOCUMENTO PDF", PDF);
        documento.exportador();
        
        ExportaExel excel = new ExportaExel();
        Documento documendoExcel = new Documento("ESTE ES UN DOCUMENTO EXCEL", excel);
        documendoExcel.exportador();
        
        ExportadorWord word = new ExportadorWord();
        Documento documentoWord = new Documento("ESTE ES UN DOCUMENTO WORD", word);
        documentoWord.exportador();
                
    }
    
}
