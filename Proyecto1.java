package mx.unam.fi.poo.g1.p56;

import mx.unam.fi.poo.g1.p56.*;

/**
 * Clase principal Proyecto 1 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Proyecto1 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/

  public static void main(String[] args) {
    Libreria libreria = new Libreria();

    Libro libro1 = new Libro("Momo", "Michael Ende");
    Libro libro2 = new Libro("La historia interminable", "Michael Ende");
    Libro libro3 = new Libro("Crimen y Castigo", "Fedor M.Dostoievski");
    Libro libro4 = new Libro("Guerra y paz", "Leon Tolstoi");
    Libro libro5 = new Libro("Orgullo y prejuicio", "Jane Austen");

    libreria.agregarLibro(libro1); 
    libreria.agregarLibro(libro2); 
    libreria.agregarLibro(libro3); 
    libreria.agregarLibro(libro4); 
    libreria.agregarLibro(libro5); 

    System.out.println("Libros disponibles: ");
    for (Libro libro : libreria.getLibros()) {
      System.out.println(libro.getTitulo() + " por " + libro.getAutor());
    }

    libreria.quitarLibro(libro5);

    System.out.println("Libros disponibles despues de quitar " + libro5.getTitulo() + ":");
    for (Libro libro : libreria.getLibros()) {
      System.out.println(libro.getTitulo() + " por " + libro.getAutor());
    }
  }
}
