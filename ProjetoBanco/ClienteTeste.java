<<<<<<< HEAD
package ProjetoBanco;

=======
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
public class ClienteTeste {
  public static void main(String[] args) {

    Cliente cliente1 = new Cliente("João", "1234-5", "1594654", new ContaPoupanca());

    cliente1.conta.deposito(555.55);
    System.out.println(cliente1.dadosCliente());
    System.out.println(cliente1.conta.verSaldo());

    cliente1.conta.saque(100);
    System.out.println(cliente1.conta.verSaldo());


    System.out.println("#############################");


    Cliente cliente2 = new Cliente("Vitor", "3216-5", "153421", new ContaCorrente(100));

    cliente2.conta.deposito(1000.00);
    System.out.println(cliente2.dadosCliente());
    System.out.println(cliente2.conta.verSaldo());

    cliente2.conta.saque(1000);
    cliente2.conta.saque(100);
    System.out.println(cliente2.conta.verSaldo());

    cliente2.conta.deposito(10);
    System.out.println(cliente2.conta.verSaldo());

  }
}
