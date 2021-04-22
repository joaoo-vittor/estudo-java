import java.util.Random;

public class MainQuestao2 {
  public static void main(String[] args) {

    Produto p1 = new Produto("Bife1", "Descricao Carne1", 28.59);
    Produto p2 = new Produto("Bife2", "Descricao Carne2", 68.18);
    Produto p3 = new Produto("Bife3", "Descricao Carne3", 38.15);
    Produto p4 = new Produto("Bife4", "Descricao Carne4", 24.75);
    Produto p5 = new Produto("Bife5", "Descricao Carne5", 18.51);
    Produto p6 = new Produto("Bife6", "Descricao Carne6", 78.28);
    Produto p7 = new Produto("Bife7", "Descricao Carne7", 91.24);
    Produto p8 = new Produto("Bife8", "Descricao Carne8", 5.58);
    Produto p9 = new Produto("Bife9", "Descricao Carne9", 8.55);
    Produto p10 = new Produto("Bife10", "Descricao Carne10", 2.25);

    Comanda comanda = new Comanda(1);

    comanda.addItem(p1, 1);
    comanda.addItem(p1, 2);
    comanda.addItem(p2, 1);
    comanda.addItem(p3, 1);
    comanda.addItem(p4, 1);
    comanda.addItem(p5, 1);
    comanda.addItem(p6, 1);
    comanda.addItem(p7, 1);
    comanda.addItem(p8, 1);
    comanda.addItem(p9, 1);
    comanda.addItem(p10, 1);

    comanda.infoComanda();

    System.out.println("----------------------------");

    Comanda comanda2 = new Comanda(2);
    Random gerador = new Random();

    for (int i = 1; i <= 10; i++) {
      String nome = "Produto"+i;
      String descricao = "Descricao"+i;
      int qtd = gerador.nextInt(10);
      double preco = gerador.nextDouble() * 10 * qtd;
      comanda2.addItem(new Produto(nome, descricao, preco), qtd);
    }

    comanda2.infoComanda();

  }
}
