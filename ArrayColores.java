package mx.unam.fi.poo.g1.p3;

import java.util.ArrayList;

/**
 * Clase ArrayColores 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class ArrayColores {
  private ArrayList<String> colores;

  /**
   * Metodo Constructor
  **/

  public ArrayColores() {
    colores = new ArrayList<>();
    colores.add("rojo");
    colores.add("verde");
    colores.add("azul");
    colores.add("blanco");
    colores.add("negro");
    colores.add("morado");
  }

  /**
   * Metodo cambiarColor
   * @param indice -> Indice del ArrayList a cambiar
   * @param nuevoColor -> Cadena del nuevo color
  **/

  public void cambiarColor(int indice, String nuevoColor) {
    if (indice >= 0 && indice < colores.size()) {
      colores.set(indice, nuevoColor);
    } else {
      System.out.println("Índice fuera de rango.");
    }
  }

  /**
   * Metodo mostrarLista
   * Muestra en pantalla la lista de colores
  **/

  public void mostrarLista() {
    System.out.println("La lista es: " + colores);
  }

  /**
   * Metodo obtenerColor
   * @param indice -> Indice del ArrayList 
   * @return color -> Color dado por el indice
  **/

  public String obtenerColor(int indice) {
    String color = colores.get(indice);
    return color;
  }
}
