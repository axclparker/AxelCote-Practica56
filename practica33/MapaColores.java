package mx.unam.fi.poo.g1.p3;

import java.util.HashMap;

/**
 * Clase MapaColores 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class MapaColores {
  private HashMap<Integer, String> mapa;

  /**
   * Metodo Constructor
  **/

  public MapaColores() {
    mapa = new HashMap<>();
    mapa.put(1, "rojo");
    mapa.put(2, "verde");
    mapa.put(3, "negro");
    mapa.put(4, "blanco");
    mapa.put(5, "azul");
  }

  /**
   * Metodo obtenerContenido
   * @param llave -> Llave para acceder al valor del mapa
   * @return contenido -> Contenido dado por la llave
  **/

  public String obtenerContenido(int llave) {
    String contenido = mapa.get(llave);
    return contenido;
  }

  /**
   * Metodo mostrarMapa
   * Muestra en pantalla el mapa de colores
  **/

  public void mostrarMapa() {
    System.out.println("Mapa original: " + mapa);
  }
}
