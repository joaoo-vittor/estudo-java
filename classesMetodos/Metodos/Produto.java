package Metodos;


public class Produto {

  String nome;
  double preco;
  double desconto;

  // double precoComDesconto(double preco, double desconto) {
  //   double precoFinal = preco - (preco * (desconto / 100));
  //   return precoFinal;
  // }
  
  double precoComDesconto() {
    return preco - (preco * (desconto / 100));
  }

}