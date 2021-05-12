package Questao1;

public class MainQuestao1 {
  public static void main(String[] args) {

    System.out.println("\n-----------------------------\n");

    Novo novo = new Novo(100000, "Rua do charme, 102", 1500000);

    System.out.println(novo.toString());

    System.out.println("\n-----------------------------\n");

    Velho velhor = new Velho(10000, "Rua dos pipinos, 101", 2500000);

    System.out.println(velhor.toString());
    System.out.println();

    velhor.setDesconto(15000);
    System.out.println(velhor.toString());
    System.out.println();

  }
}
