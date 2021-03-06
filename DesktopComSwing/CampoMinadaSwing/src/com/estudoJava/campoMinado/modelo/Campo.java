package CampoMinadaSwing.src.com.estudoJava.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Campo {

  private final int linha;
  private final int coluna;

  private boolean minado = false;
  private boolean aberto = false;
  private boolean marcado = false;

  private List<Campo> vizinhos = new ArrayList<>();
  private List<CampoObservador> observadores = new ArrayList<>();

  public Campo(int linha, int coluna) {
    this.linha = linha;
    this.coluna = coluna;
  }

  public void registrarObservador(CampoObservador observador) {
    observadores.add(observador);
  }

  private void notificarObservadores(CampoEvento evento) {
    observadores.stream()
                .forEach(ob -> ob.eventoOcorreu(this, evento));
  }

  public boolean adicionarVizinho(Campo vizinho) {
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

  public void alternarMarcacao() {
    if (!this.aberto) {
      this.marcado = !this.marcado;

      if (this.marcado) {
        notificarObservadores(CampoEvento.MARCAR);
      } else {
        notificarObservadores(CampoEvento.DESMARCAR);
      }
    }
  }

  public boolean abrir() {
    if (!this.aberto && !this.marcado) {

      if (this.minado) {
        notificarObservadores(CampoEvento.EXPLODIR);
        return true;
      }

      this.setAberto(true);

      if (vizinhacaSegura()) {
        this.vizinhos.forEach(v -> v.abrir());
      }

      return true;
    }
    return false;
  }

  public boolean vizinhacaSegura() {
    return this.vizinhos.stream().noneMatch(v -> v.minado);
  }

  public void minar() {
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

    if (aberto) {
      notificarObservadores(CampoEvento.ABRIR);
    }
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

  public int minasNaVizinhanca() {
    return (int) this.vizinhos.stream().filter(v -> v.minado).count();
  }

  void reiniciar() {
    this.aberto = false;
    this.minado = false;
    this.marcado = false;

    notificarObservadores(CampoEvento.REINICIAR);
  }



}
