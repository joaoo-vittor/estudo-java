<<<<<<< HEAD
package Lambda.Funcao;
=======
package Funcao;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.function.Function;

public class Funcao {
  public static void main(String[] args) {
    Function<Integer, String> parOuImpar =
            numero -> numero % 2 == 0 ? "Par" : "Impar";



    Function<String, String> oREsultado =
            valor -> "O resultado é: "+ valor;

    Function<String, String> empolgado = valor -> valor + "!!!";

    String resultadoFinal = parOuImpar
            .andThen(oREsultado)
            .andThen(empolgado)
            .apply(32);

    System.out.println(resultadoFinal);
    System.out.println(parOuImpar.apply(32));

  }
}
