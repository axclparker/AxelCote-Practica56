package mx.unam.fi.poo.g1.p4;

/**
 * Clase CuentaBanco 
 * @author Axel Cote 
 * @version Septiembre-2024
**/

public class CuentaBanco {
  private String nombre;
  private String cuenta;
  private double saldo;

  /**
   * Metodo Constructor
   * Para construir objetos CuentaBanco
   * @param nombre -> Atributo para el nombre de CuentaBanco 
   * @param cuenta -> Atributo para el cuenta de CuentaBanco 
   * @param saldoInicial -> Atributo para el saldoInicial de CuentaBanco 
  **/

  public CuentaBanco(String nombre, String cuenta, double saldoInicial) {
    setNombre(nombre);
    setCuenta(cuenta);
    setSaldo(saldoInicial);
  }

  /**
   * Metodo set
   * @param nombre -> Para cambiar el dato de nombre de CuentaBanco
  **/

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   * Metodo set
   * @param cuenta -> Para cambiar el dato de cuenta de CuentaBanco
  **/

  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Metodo get 
   * @return saldo -> Regresa el atributo saldo
  **/

  public double getSaldo() {
    return saldo;
  }

  /**
   * Metodo set
   * @param saldo -> Para cambiar el dato de saldo de CuentaBanco
  **/

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Metodo depositar
   * @param monto -> Para cambiar el dato de saldo + monto de CuentaBanco
  **/

  public void depositar(double monto) {
    saldo += monto;
  }

  /**
   * Metodo retirar
   * @param monto -> Para cambiar el dato de saldo - monto de CuentaBanco
  **/

  public void retirar(double monto) {
    saldo -= monto;
  }

   /**
   * Metodo retirar
   * Muestra en pantalla los datos de CuentaBanco
  **/

  public void mostrarInfoCuenta() {
    System.out.println("Beneficiario: " + nombre);
    System.out.println("No. de cuenta: " + cuenta);
    System.out.println("Saldo actual: " + saldo);
  }
}
