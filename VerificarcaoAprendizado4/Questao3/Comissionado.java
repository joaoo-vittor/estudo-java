package Questao3;

public class Comissionado extends Funcionario {

  private double comissao;

  public Comissionado(String nome, long cpf, double salBase, double comissao) {
    super(nome, cpf, salBase);
    this.comissao = comissao;
  }

  @Override
  public double calculaRendimento() {
    return super.calculaRendimento() + this.comissao;
  }

  @Override
  public String toString() {
    return "Comissão: R$"+ this.comissao+
           "\nSalario com comissão: R$"+
           String.format("%.2f", this.calculaRendimento());
  }

}
