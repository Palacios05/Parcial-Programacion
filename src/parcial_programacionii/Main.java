import java.util.*;

public class Main {
    public static void main(String[] args) {
      
    LibrosTexto Libro1 = new LibrosTexto ( "El Parcial", "Juan Jose Palacios",  "Gabriel",  50.000, "411");
    
    Novelas Libro2 = new Novelas ("El Parcial - pareja", "Diego Armando Palacios Giraldo", "Gabriel",  50.000, "Realista");
    
    Libro1.imprimir();
    
    System.out.println();
    
    Libro2.imprimir();
  }
}