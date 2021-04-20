<<<<<<< HEAD
package classesMetodos.ClasseProduto;
=======
package ClasseProduto;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce


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
