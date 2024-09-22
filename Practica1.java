package mx.unam.fi.poo.g1.p1;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p1.Punto;

/**
 * Clase principal Practica 1 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Practica1 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/

  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("\nIngresa las coordenadas decimales de la latitud (x1) del punto 1: ");
    double x1 = entrada.nextDouble();

    System.out.print("Ingresa las coordenadas decimales de la longitud (y1) del punto 1: ");
    double y1 = entrada.nextDouble();

    Punto punto1 = new Punto(x1, y1);

    System.out.print("\nIngresa las coordenadas decimales de la latitud (x2) del punto 2: ");
    double x2 = entrada.nextDouble();

    System.out.print("Ingresa las coordenadas decimales de la longitud (y2) del punto 2: ");
    double y2 = entrada.nextDouble();

    Punto punto2 = new Punto(x2, y2);

    entrada.close();
    System.out.print("\nLa distancia entre los dos puntos es: " + distancia(punto1, punto2) + " [km]");
  }

  public static double distancia(Punto punto1, Punto punto2){
    double r = 6371.01;
    
    double x1 = Math.toRadians(punto1.getLatitud());
    double y1 = Math.toRadians(punto1.getLongitud());
    double x2 = Math.toRadians(punto2.getLatitud());
    
    double y2 = Math.toRadians(punto2.getLongitud());
    
    double restriccion = Math.acos((Math.sin(x1) * Math.sin(x2)) + (Math.cos(x1) * Math.cos(x2) * Math.cos(y2 - y1)));
    
    return r * restriccion;
  }
}
