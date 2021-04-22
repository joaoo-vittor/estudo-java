public class Comanda {

  private int idComanda = 1;
  private Produto[] produtos;
  private int qtdProdComando = 0;

  public Comanda(int numeroDaComanda) {
    this.idComanda = numeroDaComanda;
    this.produtos = new Produto[10];
  }

  public void addItem(Produto p, int qtdProd) {

    for (int i = 0; i < this.qtdProdComando; i++) {
      if (produtos[i].equals(p)) {
        produtos[i].setQtdProduto(produtos[i].getQtdProduto()+qtdProd);
        return;
      }
    }

    if (this.qtdProdComando < 10) {
      p.setQtdProduto(qtdProd);
      this.produtos[qtdProdComando] = p;
      this.qtdProdComando++;
    }
  }

  public void infoComanda() {
    System.out.println("Número da comanda: "+this.idComanda);
    System.out.println("Produtos: ");
    for (int i = 0; i < this.qtdProdComando; i++) {
      System.out.printf("- %s: R$ %.2f\n", produtos[i].getNome(),
      produtos[i].getPreco());
    }
    System.out.printf("Total da Comanda: %.2f\n", this.calculaTotal());
  }

  public double calculaTotal() {
    double total = 0.0D;
    for (int i = 0; i < this.qtdProdComando; i++) {
      total += produtos[i].getPreco() * produtos[i].getQtdProduto();
    }

    return total;
  }

}
