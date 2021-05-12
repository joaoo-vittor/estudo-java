package Questao3;

public class MainQuestao3 {
  public static void main(String[] args) {

    CLT clt = new CLT("josé", 12345678998L, 2000, 100);
    Horista horista = new Horista("Maria", 98765432165L, 1000, 160, 20);
    Comissionado comissionado = new Comissionado("Lucas", 15935774132L, 3000, 500);

    System.out.println();
    clt.imprimirDados();
    System.out.println(clt.toString()+"\n");

    horista.imprimirDados();
    System.out.println(horista.toString()+"\n");

    comissionado.imprimirDados();
    System.out.println(comissionado.toString()+"\n");

  }
}
