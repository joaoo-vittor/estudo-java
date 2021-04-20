package Lambda.Consumidor;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
  public static void main(String[] args) {

    Consumer<Produto> imprimir = p -> System.out.println(p.nome + "!!!");

    Produto p1 = new Produto("Caneta", 1.5, 0.012);
    imprimir.accept(p1);

    Produto p2 = new Produto("Borracha", 5.5, 0.011);
    Produto p3 = new Produto("Caderno", 14.5, 0.12);
    Produto p4 = new Produto("Lapizeira", 3.5, 0.25);
    Produto p5 = new Produto("Papel A4", 9.5, 0.029);

    List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

    produtos.forEach(imprimir);
    produtos.forEach(p -> System.out.println(p.preco));
    produtos.forEach(System.out::println);

  }
}
