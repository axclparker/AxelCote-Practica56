package mx.unam.fi.poo.g1.p3;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p3.ArrayColores;

/**
 * Clase principal Practica 32 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Practica32 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    ArrayColores arrayColores = new ArrayColores();
    arrayColores.mostrarLista();

    System.out.print("Escriba un nuevo color a cambiar por \"" + arrayColores.obtenerColor(1) + "\": ");
    String nuevoColor = entrada.nextLine();

    entrada.close();

    arrayColores.cambiarColor(1, nuevoColor);
    arrayColores.mostrarLista();
  }
}
