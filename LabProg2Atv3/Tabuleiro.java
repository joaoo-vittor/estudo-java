import java.util.Random;

public class Tabuleiro {

  public String[][] tabuleiro;
  private String DAMA = " 👑 ";
  private String SPACE = "    ";
  private static Random rand;


  public Tabuleiro() {
    this.tabuleiro = new String[8][8];
    rand = new Random();
  }

  public void inicio() {
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        this.tabuleiro[i][j] = this.SPACE;
      }
    }
  }

  public void novaPosicao() {
    int col = 0;
    int lin = 0;
    int i = 0;
    while (i < 8) {
      lin = rand.nextInt(8);
      if (isValidoLinha(lin)) {
        tabuleiro[lin][col] = this.DAMA;
        col++;
        i++;
      }
    }
  }

  public boolean isValidoLinha(int linha) {
    boolean linValida = false;
    for (int i = 0; i < 8; i++) {
      if (this.tabuleiro[linha][i] == this.SPACE) {
        linValida = true;
      } else {
        return false;
      }
    }
    return linValida;
  }

  public void imprimir() {
    System.out.println("  0    1    2    3    4    5    6    7  ");
    System.out.println("-----------------------------------------");
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 8; j++) {
        System.out.print("|");
        System.out.printf("%s",this.tabuleiro[i][j]);
        if (j==7) {
          System.out.print("| "+i);
        }
      }
      System.out.println();
      System.out.println("-----------------------------------------");
    }
  }

  public boolean verificar() {
    int posicaoAnt[] = {0,0};
    int posicaoPro[] = {0,0};
    boolean valido = false;

    for (int i = 0; i < 7; i++) {
      for (int j = 0; j <= 7; j++) {
        if (this.tabuleiro[i][j] == this.DAMA) {
          posicaoAnt[0] = i;
          posicaoAnt[1] = j;
        }

        if (this.tabuleiro[i+1][j] == this.DAMA) {
          posicaoPro[0] = i+1;
          posicaoPro[1] = j;
        }
      }

      if ((posicaoAnt[0] != posicaoPro[0])) {
        double distanciaEucli = distanciaEuclidiana(posicaoAnt, posicaoPro);

        if (distanciaEucli >= 3 && !maisDeUmDamaMsmDiagonal()) {
          valido = true;
        } else {
          return false;
        }
      }
    }
    return valido;
  }

  private double distanciaEuclidiana(int[] pontoA, int[] pontoB) {
    double a = Math.pow(pontoA[0] - pontoB[0], 2);
    double b = Math.pow(pontoA[1] - pontoB[1], 2);
    double soma = a + b;
    double c = Math.sqrt(soma);
    return c;
  }

  private boolean maisDeUmDamaMsmDiagonal() {
    int aux = 0;
    boolean maisDeUmDamaNaMsmDiag = false;

    for(int c = 0; c < 7; c++) {
      aux = 0;
      for (int r = 0; r <= 7 - c; r++) {
        if(!(this.tabuleiro[r][c+r] == this.SPACE)) {
          aux++;
        }
      }
      if (aux>1) {
        maisDeUmDamaNaMsmDiag = true;
      }
    }

    for (int r = 0; r < 7; r++){
      aux = 0;
      for (int c = 7; c >= r; c--){
        if(!(this.tabuleiro[7-c+r][c] == this.SPACE)) {
          aux++;
        }
      }
      if (aux>1) {
        maisDeUmDamaNaMsmDiag = true;
      }
    }

    for (int c = 7; c > 0; c--){
      aux = 0;
      for (int r = 7; r >= 7 - c; r--){
        if(!(this.tabuleiro[r][c+r-7] == this.SPACE)) {
          aux++;
        }
      }
      if (aux>1) {
        maisDeUmDamaNaMsmDiag = true;
      }
    }

    for (int r = 7; r > 0; r--){
      aux = 0;
      for (int c = 0; c <= r; c++){
        if(!(this.tabuleiro[r-c][c] == this.SPACE)) {
          aux++;
        }
      }
      if (aux>1) {
        maisDeUmDamaNaMsmDiag = true;
      }
    }

    return maisDeUmDamaNaMsmDiag;
  }

}
