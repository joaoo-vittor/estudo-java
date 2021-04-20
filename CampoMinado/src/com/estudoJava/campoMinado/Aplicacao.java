<<<<<<< HEAD
package CampoMinado.src.com.estudoJava.campoMinado;

import CampoMinado.src.com.estudoJava.campoMinado.modelo.Tabuleiro;
import CampoMinado.src.com.estudoJava.campoMinado.visao.TabuleiroConsole;
=======
package com.estudoJava.campoMinado;

import com.estudoJava.campoMinado.modelo.Tabuleiro;
import com.estudoJava.campoMinado.visao.TabuleiroConsole;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Aplicacao {
  public static void main(String[] args) {

    Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
    new TabuleiroConsole(tabuleiro);

  }
}
