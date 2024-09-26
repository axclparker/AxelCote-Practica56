package mx.unam.fi.poo.g1.p4;

import java.util.Scanner;
import mx.unam.fi.poo.g1.p4.CuentaBanco;

/**
 * Clase principal Practica 4 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class Practica4 {
  /**
   * Metodo main
   * Se ejecuta todo el funcionamiento de la aplicacion
   * @param args -> Arreglo por defecto del metodo main
  **/

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Nombre del beneficiario: ");
    String nombre = s.nextLine();

    System.out.print("No. de cuenta del beneficiario: ");
    String cuenta = s.nextLine();

    System.out.print("Deposito inicial: ");
    double depositoInicial = s.nextDouble();

    CuentaBanco cuentaBanco = new CuentaBanco(nombre, cuenta, depositoInicial);

    cuentaBanco.mostrarInfoCuenta();

    System.out.print("\n¿Cuanto desea depositar?: ");
    double montoDeposito = s.nextDouble();
    cuentaBanco.depositar(montoDeposito);

    cuentaBanco.mostrarInfoCuenta();

    System.out.print("\n¿Cuanto desea retirar?: ");
    double montoRetiro = s.nextDouble();
    cuentaBanco.retirar(montoRetiro);

    cuentaBanco.mostrarInfoCuenta();

    s.close();
  }
}
