package mx.unam.fi.poo.g1.p2;

/**
 * Clase TrianguloPascal 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class TrianguloPascal {
  private int filas;  

  /**
   * Metodo Constructor
   * Para construir objetos TrianguloPascal
   * @param filas -> Atributo para las filas del TrianguloPascal 
  **/

  public TrianguloPascal(int filas) {
      this.filas = filas;
  }

  /**
   * Metodo mostrarTriangulo 
   * Muestra el tiagulo de Pascal dado por el numero de filas
  **/

  public void mostrarTriangulo() {
      int cont1 = 1;
      int cont2 = 1;
      int c = 0;
      int d = 0;

      for (int i = 1; i <= filas; i++) {
          for (int j = 1; j <= (filas - i); j++) {
              System.out.print(" ");
          }

          if (i < filas) {
              cont2++;
          } else {
              cont2--;
          }

          for (int k = 0; k < cont1; k++) {
              if (k % 2 == 0 || k == 0) {
                  int lugar = factorial(d) / (factorial(c) * factorial(d - c));
                  System.out.print(lugar);
                  c++;
              } else {
                  System.out.print(" ");
              }
          }

          if (i < filas) {
              cont1 += 2;
          } else {
              cont1 -= 2;
          }

          System.out.println();

          c = 0;
          d++;
      }
  }

  /**
   * Metodo factorial privado
   * @param x -> Numero del factorial
   * @return fac -> Factorial del numero
  **/

  private int factorial(int x) {
      int fac = 1;
      for (int i = 1; i <= x; i++) {
          fac *= i;
      }
      return fac;
  }
}