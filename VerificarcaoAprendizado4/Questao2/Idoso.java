package Questao2;

public class Idoso extends Passageiro {

  public Idoso(double valorPassagem, String poltronaPassageiro, int idade) {
    super(valorPassagem, poltronaPassageiro, idade);
  }

  public double valorPassagem() {
    return (super.getValorPassagem() - (super.getValorPassagem() * 0.3));
  }

  public String toString() {
    return super.toString()+
           "\nValor da Passagem de Idoso: R$"+
            String.format("%.2f", this.valorPassagem());
  }

}
