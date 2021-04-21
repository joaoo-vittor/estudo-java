public class Board {

  public static final String BOARD  = " ";
  public static final String QUEEN = "D";
  public String[][] board;
  private int colunas = 8;
  private int linhas = 8;

  public Board() {
    board = new String[8][8];
  }

  public void inicio() {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        this.board[i][j] = BOARD;
      }
    }
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
        sb.append(this.board[l][c]);
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
