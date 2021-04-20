<<<<<<< HEAD
package Lambda.Consumidor;
=======
package Consumidor;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Produto {

  final String nome;
  final double preco;
  final double desconto;

  public Produto(String nome, double preco, double desconto) {
    this.nome = nome;
    this.preco = preco;
    this.desconto = desconto;
  }

  public String toString() {
    double precoFinal = this.preco * (1 - this.desconto);
    return "Nome: "+ this.nome +" tem preço de R$"+ precoFinal;
  }

}
