<<<<<<< HEAD
package classesMetodos.ClasseProduto;
=======
package ClasseProduto;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class ProdutoTeste {
  public static void main(String[] args) {

    Produto p1 = new Produto("Notebook", 4356.89);
    var p2 = new Produto("iPhone", 7515.15);

    Produto.desconto = 0.50;

    System.out.printf("Nome: %s \nPreco: %.2f \n", p1.nome, p1.precoComDesconto());
    System.out.printf("Nome: %s \nPreco: %.2f \n", p2.nome, p2.precoComDesconto());

  }
}
