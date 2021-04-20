<<<<<<< HEAD
package classesMetodos.Metodos;
=======
package Metodos;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class ProdutoTeste {
  public static void main(String[] args) {
    
    Produto p1 = new Produto();
    p1.nome = "calça";
    p1.preco = 100;
    p1.desconto = 10;

    double precoComDesc = p1.precoComDesconto();

    System.out.printf("Produto: %s",p1.nome);
    System.out.printf("\nPreco: %.2f",p1.preco);
    System.out.printf("\nPreco com desconto %.2f\n", precoComDesc);

  }
}
