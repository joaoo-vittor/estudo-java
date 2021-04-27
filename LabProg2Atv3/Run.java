import java.util.Random;

public class Run {

  private Board board;
  private int queensCounter;
  private boolean[] usedRows;
  private static Random rand;

  /*
    Construtor
  */
  public Run() {
    rand = new Random();
    board = new Board();
    usedRows = new boolean[8];
    queensCounter = 0;
  }

  /*
    PlaceQueens() -> imprimi as 1000 iterações
  */
  public void PlaceQueens(){
    int i = 0;
    int total = 0;
    String trueBord = "";

    board.inicio();
    System.out.println("Iteração\tSolução encontrada");
    while(i < 1000) {
      this.setPosicao();
      if (isWinner()) {
        System.out.printf("  %d\t\t\tVerdadeiro\n",i+1);
        total++;
        trueBord = board.imprimir();
        board.inicio();
        this.queensCounter = 0;
        this.usedRows = new boolean[8];
      } else {
        System.out.printf("  %d\t\t\tFalso\n",i+1);
      }
      i++;
    }
    System.out.println("Total\t\tSoluções");
    System.out.printf(" %d\t\t  %d\n\n", i, total);

    System.out.println("Ultima solução correta: \n");
    System.out.println(trueBord);

  }

  /*
    setPosicao() -> seta a posição das Damas no tabuleiro
    de maneira randomica.
  */
  public void setPosicao() {
    int col = 0;
    int lin = 0;
    while (queensCounter < 8) {
      lin = rand.nextInt(8);
      if (isValidoLinha(lin)) {
        board.board[lin][col] = Board.QUEEN;
        col++;
        queensCounter++;
      }
    }
  }

  /*
    isValidoLinha(int linha) -> verifica se em determinada
    linha é possivel colocar uma Dama.
  */
  public boolean isValidoLinha(int linha) {
    if (!usedRows[linha]) {
      usedRows[linha] = true;
      return true;
    }
    return false;
  }

  /*
    isWinner() -> verifica as diagonais do tabuleiro e se as Damas não
    estão posisão de ataque.
  */
  public boolean isWinner() {
    int attackingQueensCounter = 0;

    // diagonal
    for(int c = 0; c < 7; c++) {
      for (int r = 0; r <= 7 - c; r++) {
        if(!board.board[r][c+r].equalsIgnoreCase(Board.BOARD)) {
          attackingQueensCounter++;
          if(!countQueens(attackingQueensCounter)) {
            return false;
          }
        }
      }
      attackingQueensCounter = 0;
    }

    attackingQueensCounter = 0;
    for (int r = 0; r < 7; r++){
      for (int c = 7; c >= r; c--){
        if (!board.board[7-c+r][c].equalsIgnoreCase(Board.BOARD)) {
          attackingQueensCounter++;
          if (!countQueens(attackingQueensCounter)) {
            return false;
          }
        }
      }
      attackingQueensCounter = 0;
    }

    attackingQueensCounter = 0;
    for (int c = 7; c > 0; c--){
      for (int r = 7; r >= 7 - c; r--){
        if (!board.board[r][c+r-7].equalsIgnoreCase(Board.BOARD)) {
          attackingQueensCounter++;
          if (!countQueens(attackingQueensCounter)) {
            return false;
          }
        }
      }
      attackingQueensCounter = 0;
    }

    attackingQueensCounter = 0;
    for (int r = 7; r > 0; r--){
      for (int c = 0; c <= r; c++){
        if (!board.board[r-c][c].equalsIgnoreCase(Board.BOARD)) {
          attackingQueensCounter++;
          if (!countQueens(attackingQueensCounter)) {
            return false;
          }
        }
      }
      attackingQueensCounter = 0;
    }

    return true;
  }

  /*
    countQueens(int attackingQueensCounter) -> verifica se existe Damas que
    estão se atacando, reinicia o tabuleiro e retorna false.
  */
  private boolean countQueens(int attackingQueensCounter){
    if (attackingQueensCounter > 1){
      queensCounter = 0;
      usedRows = new boolean[8];
      board.inicio();
      return false;
    }
    return true;
  }

}
