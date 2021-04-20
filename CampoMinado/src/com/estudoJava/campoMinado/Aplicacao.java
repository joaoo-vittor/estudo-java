package CampoMinado.src.com.estudoJava.campoMinado;

import CampoMinado.src.com.estudoJava.campoMinado.modelo.Tabuleiro;
import CampoMinado.src.com.estudoJava.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {
  public static void main(String[] args) {

    Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
    new TabuleiroConsole(tabuleiro);

  }
}
