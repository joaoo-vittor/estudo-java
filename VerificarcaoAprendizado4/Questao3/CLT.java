package Questao3;

public class CLT extends Funcionario {

  private double tributos;

  public CLT(String nome, long cpf, double salBase, double tributos) {
    super(nome, cpf, salBase);
    this.tributos = tributos;
  }

  @Override
  public double calculaRendimento() {
    return super.calculaRendimento() - this.tributos;
  }

  @Override
  public String toString() {
    return "Tributos: R$"+ this.tributos+
           "\nSalario com desconto de tributos: "+
           String.format("%.2f", this.calculaRendimento());
  }

}
