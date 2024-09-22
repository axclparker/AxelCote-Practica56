package mx.unam.fi.poo.g1.p3;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p3.Caracter;

/**
 * Clase principal Practica 31 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Practica31 {
	/**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/
	
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Escribe una frase: ");
    String cad = entrada.nextLine();

    System.out.print("Escribe el caracter que quieras reemplazar: ");
    String c1 = entrada.nextLine();

    System.out.print("Escribe el caracter por el que lo que quieras reemplazar: ");
    String c2 = entrada.nextLine();

    entrada.close();

    Caracter reemplazo = new Caracter(cad);
    String nuevaCadena = reemplazo.reemplazarCaracter(c1, c2);

    System.out.println("Frase modificada: " + nuevaCadena);
  }
}
