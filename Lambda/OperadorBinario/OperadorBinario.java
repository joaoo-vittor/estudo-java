<<<<<<< HEAD
package Lambda.OperadorBinario;
=======
package OperadorBinario;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
  public static void main(String[] args) {

    BinaryOperator<Double> media =
            (Double n1, Double n2) -> (n1 + n2) / 2;

    System.out.println(media.apply(9.8, 5.7));

    BiFunction<Double, Double, String> resultado = (x, y) -> {
      double notaFinal = (x + y) / 2;
      return notaFinal >= 7 ? "Aprovado" : "Reprovado";
    };

    System.out.println(resultado.apply(9.8, 5.7));

    Function<Double, String> conceito = md -> md >= 7 ? "Aprovado" : "Reprovado";

    System.out.println(media.andThen(conceito).apply(9.8, 3.1));

  }
}
