package mx.unam.fi.poo.g1.p2;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p2.TrianguloPascal;

/**
 * Clase principal Practica 2 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Practica2 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/
  
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.print("Escribe el numero de filas: ");
    int n = entrada.nextInt();
    
    entrada.close();
    
    TrianguloPascal triangulo = new TrianguloPascal(n);
    triangulo.mostrarTriangulo();
  }
}
