package mx.unam.fi.poo.g1.p1;

/**
 * Clase Punto 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Punto {
  private double latitud;
  private double longitud;

  /**
   * Metodo Constructor
   * Para construir objetos Punto
   * @param latitud -> Atributo para la latitud del Punto 
   * @param longitud -> Atributo para la longitud del Punto 
  **/

  public Punto(double latitud, double longitud) {
    setLatitud(latitud);
    setLongitud(longitud);
  }

  /**
   * Metodo get 
   * @return latitud -> Regresa el atributo latitud
  **/

  public double getLatitud() {
      return latitud;
  }

  /**
   * Metodo set
   * @param latitud -> Para cambiar el dato de latitud del Punto
  **/

  public void setLatitud(double latitud) {
    this.latitud = latitud;
  }

  /**
   * Metodo get 
   * @return longitud -> Regresa el atributo longitud
  **/
  public double getLongitud() {
      return longitud;
  }

  /**
   * Metodo set
   * @param longitud -> Para cambiar el dato de longitud del Punto
  **/

  public void setLongitud(double longitud) {
    this.longitud = longitud;
  }
}