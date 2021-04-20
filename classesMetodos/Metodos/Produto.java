<<<<<<< HEAD
package classesMetodos.Metodos;
=======
package Metodos;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce


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
