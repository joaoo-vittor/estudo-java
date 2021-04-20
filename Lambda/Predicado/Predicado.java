<<<<<<< HEAD
package Lambda.Predicado;
=======
package Predicado;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.function.Predicate;

public class Predicado {
  public static void main(String[] args) {

    Predicate<Produto> isCaro =
                          prod -> (prod.preco * (1 - prod.desconto)) >= 700;

    Produto produto1 = new Produto("Notebook", 3514.59, 0.1);

    System.out.println(isCaro.test(produto1));

  }
}
