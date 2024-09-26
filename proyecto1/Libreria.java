package mx.unam.fi.poo.g1.p56;

import java.util.ArrayList;
import mx.unam.fi.poo.g1.p56.Libro;

/**
 * Clase Libreria 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Libreria {
  private ArrayList<Libro> libros;

  /**
   * Metodo Constructor
  **/

  public Libreria() {
    libros = new ArrayList<Libro>();
  }

  /**
   * Metodo agregarLibro
   * @param libro -> Objeto Libro a agregar
  **/

  public void agregarLibro(Libro libro) {
    libros.add(libro);
  }

  /**
   * Metodo quitarLibro
   * @param libro -> Objeto Libro a quitar
  **/

  public void quitarLibro(Libro libro) {
    libros.remove(libro);
  }

  /**
   * Metodo getLibros
   * @return libros -> Regresa el ArrayList
  **/

  public ArrayList<Libro> getLibros() {
    return libros;
  }
}