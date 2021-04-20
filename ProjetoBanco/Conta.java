package ProjetoBanco;

public abstract class Conta {

  public abstract String verSaldo();
  public abstract void saque(double valor);
  public abstract void deposito(double valor);

}
