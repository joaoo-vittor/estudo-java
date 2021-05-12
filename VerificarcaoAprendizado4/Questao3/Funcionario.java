package Questao3;

public class Funcionario {

  private String nome;
  private long cpf;
  private double salBase;

  public Funcionario(String nome, long cpf, double salBase) {
    this.nome = nome;
    this.cpf = cpf;
    this.salBase = salBase;
  }

  public double calculaRendimento() {
    return this.salBase;
  }

  public void imprimirDados() {
    System.out.println("Nome: "+ this.nome +
    "\nSalário: R$"+ String.format("%.2f", this.salBase));
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public long getCpf() {
    return cpf;
  }

  public void setCpf(int cpf) {
    this.cpf = cpf;
  }

  public double getSalBase() {
    return salBase;
  }

  public void setSalBase(double salBase) {
    if (salBase > 0) {
      this.salBase = salBase;
    }
  }

}
