package ProjetoBanco;

public class ContaPoupanca extends Conta {

  private double saldo;
  Cliente cliente;

  public String verSaldo() {
    return "Seu saldo é de R$"+ getSaldo();
  }

  public void saque(double valor) {
    if ((valor < getSaldo()) || (valor > getSaldo())) {
      this.saldo -= valor;
    }
  }

  public void deposito(double valor) {
    this.saldo += valor;
  }

  public double getSaldo() {
    return saldo;
  }

}
