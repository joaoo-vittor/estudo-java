
public class Main {
  public static void main(String[] args) {

    Tabuleiro tabuleiro = new Tabuleiro();

    for (int i = 0; i < 1000; i++) {
      tabuleiro.inicio();
      tabuleiro.novaPosicao();
      boolean a = tabuleiro.verificar();
      System.out.println(a);
      if (a) {
        tabuleiro.imprimir();
      }
    }

  }
}
