package Questao1;

public class Velho extends Imovel {

  private double desconto;

  public Velho(double desconto, String endereco, double preco) {
    this.desconto = desconto;
    super.setEndereco(endereco);
    super.setPreco(preco);
  }

  public double getDesconto() {
    return desconto;
  }

  public void setDesconto(double desconto) {
    if (desconto > 0) {
      this.desconto = desconto;
    }
  }

  @Override
  public String toString() {
    return super.toString() +
         "\nPreço com Desconto: "+ getTotal();
  }

  private double getTotal() {
    return super.getPreco() - this.desconto;
  }

}
