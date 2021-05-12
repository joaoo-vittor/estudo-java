package Questao2;

public class Estudante extends Passageiro {

  private String escolaEstudante;

  public Estudante(String escolaEstudante, double valorPassagem,
  String poltronaPassageiro, int idade) {
    super(valorPassagem, poltronaPassageiro, idade);
    this.escolaEstudante = escolaEstudante;
  }

  public double valorPassagem() {
    return (super.getValorPassagem() / 2);
  }

  public String toString() {
    return super.toString() +
          "\nValor da Passagem de Estudante: R$" +
            String.format("%.2f", this.valorPassagem())+
          "\nEscola do estudante: "+ this.escolaEstudante;
  }

}
