<<<<<<< HEAD
package StreamAPI.Filter;
=======
package Filter;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Desafio {
  public static void main(String[] args) {

    Produto p1 = new Produto("iPhone", 20, false);
    Produto p2 = new Produto("Notebook", 35, false);
    Produto p3 = new Produto("Televisão", 40, true);
    Produto p4 = new Produto("Ventilador", 20, true);
    Produto p5 = new Produto("Guitarra", 32, true);
    Produto p6 = new Produto("Canon T6", 31, false);

    List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);

    Predicate<Produto> descontoMaiorQ30 =
              p -> p.desconto > 30;

    Predicate<Produto> freteGratis =
              p -> p.freteGratis == true;

    Function<Produto, String> msg =
              p -> p.nome + " está com desconto de mais de 30% e frete gratis";

    produtos.stream()
            .filter(descontoMaiorQ30)
            .filter(freteGratis)
            .map(msg)
            .forEach(System.out::println);

  }
}
