<<<<<<< HEAD
package OrientacaoObjetos.Heranca;
=======
package Heranca;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Heroi extends Jogador {

  // Construtor padrão
  public Heroi(int x, int y) {
    super(x, y);
  }

  @Override
  public boolean atacar(Jogador oponente) {

    boolean ataque1 = super.atacar(oponente);
    boolean ataque2 = super.atacar(oponente);
    boolean ataque3 = super.atacar(oponente);

    return ataque1 || ataque2 || ataque3;

  }

  // boolean atacar(Jogador oponente) {
  //   int deltaX = Math.abs(x - oponente.x);
  //   int deltaY = Math.abs(y - oponente.y);
  //   if (deltaX == 0 && deltaY == 1) {
  //     oponente.vida -= 20;
  //     return true;
  //   } else if (deltaX == 1 && deltaY == 0) {
  //     oponente.vida -= 20;
  //     return true;
  //   } else {
  //     return false;
  //   }
  // }

}
