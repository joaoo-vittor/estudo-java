package PadraoObserverNoSwing;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Teste {
  public static void main(String[] args) {

    JFrame janela = new JFrame("Observador");

    janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    janela.setSize(600, 400);
    janela.setLayout(new FlowLayout());
    janela.setLocationRelativeTo(null); // Centralizar na Tela!

    JButton botao = new JButton("clicar!");

    janela.add(botao);

    botao.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        System.out.println("Evento Class Anonima Ocorreu!!!");
      }
    });

    botao.addActionListener(e -> {
      System.out.println("Evento lambda Ocorreu!!!");
    });

    janela.setVisible(true);

  }
}
