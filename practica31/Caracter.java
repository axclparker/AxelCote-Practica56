package mx.unam.fi.poo.g1.p3;

/**
 * Clase Caracter 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Caracter {
  private String cadena; 

  /**
   * Metodo Constructor
   * Para construir objetos Caracter
   * @param cadena -> Atributo para la cadena del Caracter 
  **/

  public Caracter(String cadena) {
    setCaracter(cadena);
  }

  /**
   * Metodo get 
   * @return cadena -> Regresa el atributo cadena
  **/

  public String getCaracter() {
    return cadena;
  }

  /**
   * Metodo set
   * @param cadena -> Para cambiar el dato de cadena del Caracter
  **/

  public void setCaracter(String cadena) {
    this.cadena = cadena;
  }

  /**
   * Metodo reemplazarCaracter
   * @param c1 -> Para cambiar la cadena 
   * @param c2 -> Caracter a cambiar en c1
   * @return nuevaCadena ->
  **/

  public String reemplazarCaracter(String c1, String c2) {
    String nuevaCadena = cadena.replace(c1, c2);
    return nuevaCadena;
  }
}