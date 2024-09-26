package mx.unam.fi.poo.g1.p56;

/**
 * Clase Libro 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Libro {
  private String titulo;
  private String autor;

  /**
   * Metodo Constructor
   * Para construir objetos Libro
   * @param titulo -> Atributo para el titulo del Libro 
   * @param autor -> Atributo para el autor del Libro 
  **/

  public Libro(String titulo, String autor) {
    setTitulo(titulo);
    setAutor(autor);
  }

  /**
   * Metodo get 
   * @return titulo -> Regresa el atributo titulo
  **/

  public String getTitulo() {
    return titulo;
  }

  /**
   * Metodo set
   * @param titulo -> Para cambiar el dato de titulo de Libro
  **/

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  /**
   * Metodo get
   * @return autor -> Regresa el atributo autor
  **/

  public String getAutor() {
    return autor;
  }

  /**
   * Metodo set
   * @param autor -> Para cambiar el dato de autor de Libro
  **/

  public void setAutor(String autor) {
    this.autor = autor;
  }
}