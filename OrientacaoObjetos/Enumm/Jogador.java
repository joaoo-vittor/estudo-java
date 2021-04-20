<<<<<<< HEAD
package OrientacaoObjetos.Enumm;
=======
package Enumm;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Jogador {

  int x;
  int y;

  boolean andar(Direcao direcao) {
    switch (direcao) {
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
