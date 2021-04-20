package classesMetodos.Metodos;

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
