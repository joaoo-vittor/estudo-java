package com.estudoJava.campoMinado;

import com.estudoJava.campoMinado.modelo.Tabuleiro;
import com.estudoJava.campoMinado.visao.TabuleiroConsole;

public class Aplicacao {
  public static void main(String[] args) {

    Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
    new TabuleiroConsole(tabuleiro);

  }
}
