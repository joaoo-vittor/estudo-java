public class Colecao {

  private int qtdArray = 1;
  private Revista[] colecacaoFinal;
  private Revista[] colecacaoAuxiliar;


  public Colecao() {}

  public void incluirRevista(Revista revista) {
    if (qtdArray == 1) {
      colecacaoFinal = new Revista[this.qtdArray];
      this.colecacaoFinal[0] = revista;
      this.qtdArray++;
      return;
    }

    this.colecacaoAuxiliar = new Revista[this.qtdArray];

    for (int i = 0; i < this.colecacaoAuxiliar.length; i++) {
      if (i == this.qtdArray-1) {
        this.colecacaoAuxiliar[i] = revista;
        continue;
      }
      this.colecacaoAuxiliar[i] = this.colecacaoFinal[i];
    }
    this.qtdArray++;
    this.colecacaoFinal = this.colecacaoAuxiliar;
  }

  public void excluirRevista(Revista revista) {
    if (!hasRevista(revista)) {
      return;
    }

    Revista[] auxColecao = new Revista[this.colecacaoFinal.length-1];
    if (this.colecacaoFinal.length > 1) {
      int j = 0;
      for (int i = 0; i < this.colecacaoFinal.length; i++) {
        if (!this.colecacaoFinal[i].equals(revista)) {
          auxColecao[j] = this.colecacaoFinal[i];
          j++;
        }
      }
      this.colecacaoFinal = auxColecao;
      this.qtdArray--;
    }
  }

  public boolean hasRevista(Revista revista) {
    for (Revista rev : colecacaoAuxiliar) {
      if (rev.equals(revista)) {
        return true;
      }
    }
    return false;
  }

  public void exibirColecao() {
    for (Revista revista: colecacaoFinal) {
      System.out.printf("Nome: %s\n", revista.getNome());
      System.out.printf("Autor: %s\n", revista.getAutor());
      System.out.printf("Valor: %.2f\n", revista.getValor());
    }
  }

}
