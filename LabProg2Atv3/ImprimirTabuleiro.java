public class ImprimirTabuleiro {
  private final int colunas;
  private final int linhas;

  public ImprimirTabuleiro(int colunas, int linhas) {
    this.colunas = colunas;
    this.linhas = linhas;
  }

  public String imprimir() {
    StringBuilder sb = new StringBuilder();

    sb.append("  ");
    for (int c = 0; c < this.colunas; c++) {
      sb.append("  ");
      sb.append(c);
      sb.append(" ");
    }

    sb.append(linhaDiv());
    sb.append("\n");

    for (int l = 0; l < this.linhas; l++) {
      sb.append(l);
      for (int c = 0; c < this.colunas; c++) {
        sb.append(" ");
        sb.append("| ");
        sb.append("R");
        if (c == this.colunas - 1) {
          sb.append(" |");
        }
      }
      sb.append(linhaDiv()+"\n");
    }

    return sb.toString();
  }

  private String linhaDiv() {
    String linhaDivisao = "";
    for (int i = 0; i < this.colunas; i++) {
      linhaDivisao += "+---";
      if (i == this.colunas-1) {
        linhaDivisao += "+";
      }
    }

    return "\n  " + linhaDivisao;
  }
}
