package Questao1;

public class Novo extends Imovel {

  private double adicional;

  public Novo(double adicional, String endereco, double preco) {
    this.adicional = adicional;
    super.setEndereco(endereco);
    super.setPreco(preco);
  }

  public double getAdicional() {
    return adicional;
  }

  public void setAdicional(double adicional) {
    if (adicional > 0) {
      this.adicional = adicional;
    }
  }

  @Override
  public String toString() {
    return super.toString() +
         "\nPreço com Adicional: "+ getTotal();
  }

  private double getTotal() {
    return super.getPreco() + this.adicional;
  }

}
