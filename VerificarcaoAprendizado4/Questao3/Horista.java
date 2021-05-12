package Questao3;

public class Horista extends Funcionario {

  private double numeroHoras;
  private double valorHoras;

  public Horista(String nome, long cpf, double salBase,
  double numeroHoras, double valorHoras) {
    super(nome, cpf, salBase);
    this.numeroHoras = numeroHoras;
    this.valorHoras = valorHoras;
  }

  @Override
  public double calculaRendimento() {
    return (this.numeroHoras * this.valorHoras) + super.calculaRendimento();
  }

  @Override
  public String toString() {
    return "Horas Trabalhadas: "+ this.numeroHoras+
           "\nValor por hora: R$"+ this.valorHoras+
           "\nSalario com Hora Extra: R$"+
           String.format("%.2f", this.calculaRendimento());
  }

}
