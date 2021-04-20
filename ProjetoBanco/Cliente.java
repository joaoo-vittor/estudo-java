<<<<<<< HEAD
package ProjetoBanco;

=======
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
public class Cliente {

  private String nome;
  private String agencia;
  private String numeroConta;
  Conta conta;

  Cliente(String nome, String agencia, String numeroConta, Conta conta) {
    this.nome = nome;
    this.numeroConta = numeroConta;
    this.agencia = agencia;
    this.conta = conta;
  }

  public String dadosCliente() {
    String msg1 = "Nome: "+this.nome;
    String msg2 = "Conta: "+ this.numeroConta;
    String msg3 = "Agência: "+ this.agencia;
    return msg1 + "\n" + msg2 + "\n" + msg3;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getAgencia() {
    return this.agencia;
  }

  public void setAgencia(String numAgencia) {
    this.agencia = numAgencia;
  }

  public String getNumeroConta() {
    return this.numeroConta;
  }

  public void setNumeroConta(String numConta) {
    this.numeroConta = numConta;
  }

}
