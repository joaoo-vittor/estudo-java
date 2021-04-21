import java.util.Random;

public class Run {
  private Board board;
  private int runCounter;
  private int queensCounter;
  private boolean[] usedRows;
  private static Random rand;

  public Run() {
    rand = new Random();
    board = new Board();
    usedRows = new boolean[8];
    runCounter = 0;
    queensCounter = 0;
  }

  public void PlaceQueens(){
    board.inicio();
    do{
      this.setPosicao();
      System.out.println("Iterações: "+runCounter+"\n");
    }while(!isWinner());

    System.out.println("O codigo iterou " + runCounter + " vezes para achar a configuração correta.");
  }

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
    runCounter++;
  }

  public boolean isValidoLinha(int linha) {
    if (!usedRows[linha]) {
      usedRows[linha] = true;
      return true;
    }
    return false;
  }

  public boolean isWinner() {
    System.out.print(board.imprimir());
    System.out.println();
    int attackingQueensCounter = 0;
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
