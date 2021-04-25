package CampoMinadaSwing.src.com.estudoJava.campoMinado.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador {

  private final int linhas;
  private final int colunas;
  private final int minas;

  private final List<Campo> campos = new ArrayList<>();
  private final List<Consumer<ResultadoEvento>> observadores = new ArrayList<>();

  public Tabuleiro(int linhas, int colunas, int minas) {
    this.linhas = linhas;
    this.colunas = colunas;
    this.minas = minas;

    gerarCampos();
    associarVizinhos();
    sortearMinas();
  }

  public void paraCadaCampo(Consumer<Campo> funcao) {
    campos.forEach(funcao);
  }

  public int getLinhas() {
    return linhas;
  }

  public int getColunas() {
    return colunas;
  }

  public int getMinas() {
    return minas;
  }

  public void registrarObservador(Consumer<ResultadoEvento> observador) {
    observadores.add(observador);
  }

  public void notificarObservadores(boolean resultado) {
    observadores.stream().forEach(o -> o.accept(new ResultadoEvento(resultado)));
  }

  public void abrir(int linha, int coluna) {
    campos.stream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                 .findFirst()
                 .ifPresent(c -> c.abrir());
  }

  public void alternarMarcacao(int linha, int coluna) {
    campos.stream().filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                   .findFirst()
                   .ifPresent(c -> c.alternarMarcacao());
  }

  private void gerarCampos() {
    for (int i = 0; i < this.linhas; i++) {
      for (int j = 0; j < this.colunas; j++) {
        Campo campo = new Campo(i, j);
        campo.registrarObservador(this);
        campos.add(campo);
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

  @Override
  public void eventoOcorreu(Campo campo, CampoEvento evento) {
    if (evento == CampoEvento.EXPLODIR) {
      mostrarMinas();
      notificarObservadores(false);
    } else if (this.objetivoAlcancado()) {
      notificarObservadores(true);
    }
  }

  private void mostrarMinas() {
    campos.stream()
          .filter(c -> c.isMinado())
          .filter(c -> !c.isMarcado())
          .forEach(c -> c.setAberto(true));
  }

}
