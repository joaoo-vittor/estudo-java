<<<<<<< HEAD
package OrientacaoObjetos.Heranca;
=======
package Heranca;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Jogador {

  public int x;
  public int y;
  public int vida = 100;

  protected Jogador(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public boolean atacar(Jogador oponente) {

    int deltaX = Math.abs(x - oponente.x);
    int deltaY = Math.abs(y - oponente.y);

    if (deltaX == 0 && deltaY == 1) {
      oponente.vida -= 10;
      return true;
    } else if (deltaX == 1 && deltaY == 0) {
      oponente.vida -= 10;
      return true;
    } else {
      return false;
    }

  }

<<<<<<< HEAD
  public boolean andar(OrientacaoObjetos.Enumm.Direcao norte) {
    switch (norte) {
=======
  public boolean andar(Direcao direcao) {
    switch (direcao) {
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
      case NORTE:
        y--;
        break;
      case LESTE:
        x++;
        break;
      case SUL:
        y++;
        break;
      case OESTE:
        x--;
        break;
      default:
        break;
    }

    return true;
  }

}
