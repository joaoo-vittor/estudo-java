package Questao2;

public class Passageiro {

  private double valorPassagem;
  private String poltronaPassageiro;
  private int idade;

  public Passageiro(double valorPassagem, String poltronaPassageiro, int idade) {
    this.valorPassagem = valorPassagem;
    this.poltronaPassageiro = poltronaPassageiro;
    this.idade = idade;
  }

  public double getValorPassagem() {
    return valorPassagem;
  }

  public void setValorPassagem(double valorPassagem) {
    if (valorPassagem > 0) {
      this.valorPassagem = valorPassagem;
    }
  }

  public String getPoltronaPassageiro() {
    return poltronaPassageiro;
  }

  public void setPoltronaPassageiro(String poltronaPassageiro) {
    this.poltronaPassageiro = poltronaPassageiro;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    if (idade > 0) {
      this.idade = idade;
    }
  }

  @Override
  public String toString() {
    return "Valor da Passagem Inteira: R$" + String.format("%.2f", this.valorPassagem) +
           "\nPoltrona: " + this.poltronaPassageiro +
           "\nIdade do passageiro: " + this.idade;
  }

}
