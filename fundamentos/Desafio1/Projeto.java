<<<<<<< HEAD
package fundamentos.Desafio1;
=======
package Desafio1;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Projeto {
  public static void main(String[] args) {
    // (F° - 32) x 5/9 = C°
    final int Base32 = 32;
    final double FatorMult = 5.0 / 9.0;
    double Fahrenheit = 275;
    double Celsius = (Fahrenheit - Base32) * FatorMult;
    System.out.println(Celsius);
  }
}
