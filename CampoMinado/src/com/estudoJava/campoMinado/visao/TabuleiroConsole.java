package CampoMinado.src.com.estudoJava.campoMinado.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import CampoMinado.src.com.estudoJava.campoMinado.Excecao.ExplosaoExeption;
import CampoMinado.src.com.estudoJava.campoMinado.Excecao.SairExeption;
import CampoMinado.src.com.estudoJava.campoMinado.modelo.Tabuleiro;

public class TabuleiroConsole {

  private Tabuleiro tabuleiro;
  private Scanner entrada = new Scanner(System.in);

  public TabuleiroConsole(Tabuleiro tabuleiro) {
    this.tabuleiro = tabuleiro;

    executarJogo();
  }

  private void executarJogo() {
    try {
      boolean continuar = true;

      while (continuar) {
        cicloDoJogo();

        System.out.println("Outra partida? (S/n) ");
        String resposta = entrada.nextLine();

        if ("n".equalsIgnoreCase(resposta)) {
          continuar = false;
        } else {
          tabuleiro.reiniciar();
        }

      }

    } catch (SairExeption e) {
      System.out.println("Tchau!!!");
    } finally {
      entrada.close();
    }
  }

  private void cicloDoJogo() {
    try {

      while (!tabuleiro.objetivoAlcancado()) {
        System.out.println(tabuleiro);

        String digitado = capturadoValorDigitado("Digite (x, y): ");

        Iterator<Integer> xy = Arrays.stream(digitado.split(","))
              .map(e -> Integer.parseInt(e.trim())).iterator();

        digitado = capturadoValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");

        if ("1".equals(digitado)) {
          tabuleiro.abrir(xy.next(), xy.next());
        } else if ("2".equals(digitado)) {
          tabuleiro.alternarMarcacao(xy.next(), xy.next());
        }

      }

      System.out.println(tabuleiro);
      System.out.println("Voce ganhou");
    } catch (ExplosaoExeption e) {
      System.out.println(tabuleiro);
      System.out.println("Voce perdeu!!!");
    }
  }

  private String capturadoValorDigitado(String texto) {
    System.out.print(texto);
    String digitado = entrada.nextLine();

    if ("sair".equalsIgnoreCase(digitado)) {
      throw new SairExeption();
    }

    return digitado;
  }


}
