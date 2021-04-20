<<<<<<< HEAD
package ProjetoBanco;

=======
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
public class ContaCorrente extends Conta {

  private double saldo;
  private double limite;
  Cliente cliente;

  ContaCorrente(double limite) {
    this.limite = limite;
  }

  public String verSaldo() {
    return "Seu saldo é de R$"+ getSaldo();
  }

  public void saque(double valor) {
    if (valor <= (getSaldo() + getLimite())) {
      this.saldo -= valor;
    }
  }

  public void deposito(double valor) {
    this.saldo += valor;
  }

  public double getSaldo() {
    return saldo;
  }

  public double getLimite() {
    return limite;
  }

  public void setLimite(double limite) {
    this.limite = limite;
  }

}
