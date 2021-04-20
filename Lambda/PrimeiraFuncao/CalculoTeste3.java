<<<<<<< HEAD
package Lambda.PrimeiraFuncao;
=======
package PrimeiraFuncao;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
  public static void main(String[] args) {

    BinaryOperator<Double> calc = (x, y) -> x + y;
    System.out.println(calc.apply(5.0, 3.0));

    calc = (x, y) -> x * y;
    System.out.println(calc.apply(3.0, 5.0));

  }
}
