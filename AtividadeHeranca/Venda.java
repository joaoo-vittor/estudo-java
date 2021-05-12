import java.util.Date;

public class Venda {

	private Date data = new Date();
	private Produto[] produtos;

  public Venda(Produto produto) {
    produtos = new Produto[1];
    this.produtos[0] = produto;
  }

  public Venda() {
    produtos = new Produto[1];
  }

	public void adicioneProduto(Produto p) {
		int i;

		if (this.produtos[0] == null) {
      produtos[0] = p;
		} else {
      Produto[] aux = new Produto[produtos.length+1];

      for (i = 0; i < produtos.length; i++) {
				aux[i] = produtos[i];
			}
			aux[aux.length-1] = p;
			produtos = aux;
		}

	}

	public double getTotal() {
		double total = 0.0;
		for (int i=0; i < produtos.length ;i++) {
			total += produtos[i].getPreco();
		}
		return total;
	}

  @Override
  public String toString() {
    return "Data: "+ data +"\nProdutos: \n"+ getProdutos() +
      "\nTotal: " + getTotal();
  }

  private String getProdutos() {
    String aux = "";
    for (int i = 0; i < this.produtos.length; i++) {
      aux += "  " + produtos[i].toString() + "\n";
    }
    return aux;
  }


}
