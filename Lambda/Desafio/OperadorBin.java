package Lambda.Desafio;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperadorBin {
  public static void main(String[] args) {


    // 1. Apartir do Produto calcular o preco real (com desconto)
    Function<Produto, Double> precoReal = prod -> prod.preco * (1 - prod.desconto);


    // 2. Imposto Municipal: >= 2500 (8.5%) | < 2500 (Isento)
    UnaryOperator<Double> precoComImpostoMunicipal = value -> {
      return value >= 2500 ? value * 1.085 : value;
    };


    // 3. Frete: >= 3000 (100) | < 3000 (50)
    UnaryOperator<Double> frete = value -> value >= 3000 ? value + 100.0 : value + 50.0;


    // 4. Arredondar: Deixar duas casas deciamais
    UnaryOperator<Double> arredondar = preco ->
          Double.parseDouble(String.format("%.2f", preco).replace(",", "."));


    // 5. Formatar: R$1234,56
    Function<Double, String> formatar = value -> ("R$" + value).replace(".", ",");


    Produto p = new Produto("iPhone", 7515.95, 0.09);

    String precoFinal = precoReal
              .andThen(precoComImpostoMunicipal)
              .andThen(frete)
              .andThen(arredondar)
              .andThen(formatar)
              .apply(p);

    System.out.println("O resultado final é "+ precoFinal);

  }
}
