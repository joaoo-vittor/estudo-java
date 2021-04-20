<<<<<<< HEAD
package classesMetodos.Construtor;
=======
package Construtor;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

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
