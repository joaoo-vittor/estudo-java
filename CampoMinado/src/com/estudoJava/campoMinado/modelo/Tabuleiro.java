package com.estudoJava.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import com.estudoJava.campoMinado.Excecao.ExplosaoExeption;

public class Tabuleiro {

  private int linhas;
  private int colunas;
  private int minas;

  private final List<Campo> campos = new ArrayList<>();

  public Tabuleiro(int linhas, int colunas, int minas) {
    this.linhas = linhas;
    this.colunas = colunas;
    this.minas = minas;

    gerarCampos();
    associarVizinhos();
    sortearMinas();

  }

  public void abrir(int linha, int coluna) {
    try {
      campos.stream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                   .findFirst()
                   .ifPresent(c -> c.abrir());
    } catch (ExplosaoExeption e) {
      campos.forEach(c -> c.setAberto(true));
      throw e;
    }
  }

  public void alternarMarcacao(int linha, int coluna) {
    campos.stream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                   .findFirst()
                   .ifPresent(c -> c.alternarMarcacao());
  }

  private void gerarCampos() {
    for (int i = 0; i < this.linhas; i++) {
      for (int j = 0; j < this.colunas; j++) {
        campos.add(new Campo(i, j));
      }
    }
  }

  private void associarVizinhos() {
    for (Campo campo1 : campos) {
      for (Campo campo2 : campos) {
        campo1.adicionarVizinho(campo2);
      }
    }
  }

  private void sortearMinas() {
    long minasArmadas = 0;
    Predicate<Campo> minado = c -> c.isMinado();

    do {
      int posicaoAleatoria = (int) (Math.random() * campos.size());
      campos.get(posicaoAleatoria).minar();
      minasArmadas = campos.stream().filter(minado).count();
    } while (minasArmadas < this.minas);
  }

  public boolean objetivoAlcancado() {
    return campos.stream().allMatch(c -> c.objetivoAlcancado());
  }

  public void reiniciar() {
    campos.stream().forEach(c -> c.reiniciar());
    this.sortearMinas();
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();

    sb.append("  ");
    for (int c = 0; c < this.colunas; c++) {
      sb.append(" ");
      sb.append(c);
      sb.append(" ");
    }

    sb.append("\n");

    int i = 0;
    for (int l = 0; l < this.linhas; l++) {
      sb.append(l);
      sb.append(" ");
      for (int c = 0; c < this.colunas; c++) {
        sb.append(" ");
        sb.append(campos.get(i));
        sb.append(" ");
        i++;
      }
      sb.append("\n");
    }

    return sb.toString();
  }

}
