package mx.unam.fi.poo.g1.p3;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p3.MapaColores;

/**
 * Clase principal Practica 32 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Practica33 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    MapaColores mapaColores = new MapaColores();
    mapaColores.mostrarMapa();

    System.out.print("Escriba el valor de la llave para acceder a su contenido: ");
    int llave = entrada.nextInt();

    entrada.close();

    String valor = mapaColores.obtenerContenido(llave);
    System.out.println("Contenido: " + valor);
  }
}
