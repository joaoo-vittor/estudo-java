package Questao1;

public class Imovel {

  private String endereco;
  private double preco;

  public double getPreco() {
    return preco;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  @Override
  public String toString() {
    return "Endereço: "+getEndereco()
          +"\nPreco: "+getPreco();
  }

}
