package Construtor;

public class Produto {
 
  String nome;
  double preco;
  double desconto;

  Produto(String nomeInicial, double precoInicial, double descInicial) {
    nome = nomeInicial;
    preco = precoInicial;
    desconto = descInicial;
  }

  Produto() {}
  
  double precoComDesconto() {
    return preco - (preco * (desconto / 100));
  }

}
