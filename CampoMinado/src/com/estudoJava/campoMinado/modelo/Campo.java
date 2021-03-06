<<<<<<< HEAD
package CampoMinado.src.com.estudoJava.campoMinado.modelo;
=======
package com.estudoJava.campoMinado.modelo;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.ArrayList;
import java.util.List;

<<<<<<< HEAD
import CampoMinado.src.com.estudoJava.campoMinado.Excecao.ExplosaoExeption;

=======
import com.estudoJava.campoMinado.Excecao.ExplosaoExeption;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Campo {

  private final int linha;
  private final int coluna;

  private boolean minado = false;
  private boolean aberto = false;
  private boolean marcado = false;

  private List<Campo> vizinhos = new ArrayList<>();

  public Campo(int linha, int coluna) {
    this.linha = linha;
    this.coluna = coluna;
  }

<<<<<<< HEAD
  public boolean adicionarVizinho(Campo vizinho) {
=======
  boolean adicionarVizinho(Campo vizinho) {
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
    boolean linhaDiferente = linha != vizinho.linha;
    boolean colunaDiferente = coluna != vizinho.coluna;
    boolean diagonal = linhaDiferente && colunaDiferente;

    int deltaLinha = Math.abs(linha - vizinho.linha);
    int deltaColuna = Math.abs(coluna - vizinho.coluna);
    int deltaGeral = deltaLinha + deltaColuna;

    if (deltaGeral == 1 && !diagonal) {
      vizinhos.add(vizinho);
      return true;
    } else if (deltaGeral == 2 & diagonal) {
      vizinhos.add(vizinho);
      return true;
    } else {
      return false;
    }

  }

<<<<<<< HEAD
  public void alternarMarcacao() {
=======
  void alternarMarcacao() {
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
    if (!this.aberto) {
      this.marcado = !this.marcado;
    }
  }

<<<<<<< HEAD
  public boolean abrir() {
=======
  boolean abrir() {
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
    if (!this.aberto && !this.marcado) {
      this.aberto = true;

      if (this.minado) {
        throw new ExplosaoExeption();
      }

      if (vizinhacaSegura()) {
        this.vizinhos.forEach(v -> v.abrir());
      }

      return true;
    }
    return false;
  }

  boolean vizinhacaSegura() {
    return this.vizinhos.stream().noneMatch(v -> v.minado);
  }

<<<<<<< HEAD
  public void minar() {
=======
  void minar() {
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
    this.minado = true;
  }

  public boolean isMinado() {
    return this.minado;
  }

  public boolean isMarcado () {
    return this.marcado;
  }

  void setAberto(boolean aberto) {
    this.aberto = aberto;
  }

  public boolean isAberto() {
    return this.aberto;
  }

  public boolean isFechado() {
    return !this.isAberto();
  }

  public int getLinha() {
    return this.linha;
  }

  public int getColuna() {
    return this.coluna;
  }

  boolean objetivoAlcancado() {
    boolean desvendado = !this.minado && this.aberto;
    boolean protegido = this.minado && this.marcado;
    return desvendado || protegido;
  }

  long minasNaVizinhanca() {
    return this.vizinhos.stream().filter(v -> v.minado).count();
  }

  void reiniciar() {
    this.aberto = false;
    this.minado = false;
    this.marcado = false;
  }

  public String toString() {
    if (this.marcado) {
      return "x";
    } else if (this.aberto && this.minado) {
      return "*";
    } else if (this.aberto && this.minasNaVizinhanca() > 0) {
      return Long.toString(minasNaVizinhanca());
    } else if (this.aberto) {
      return " ";
    }
    return "?";
  }

}
