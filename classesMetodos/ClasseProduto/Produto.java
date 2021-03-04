package ClasseProduto;


public class Produto {
  String nome;
  double preco;
  static double desconto = 0.25;

  Produto(String nomeProd, double precoIni) {
    nome = nomeProd;
    preco = precoIni;
  }

  double precoComDesconto() {
    return preco - (preco * desconto);
  }

}
