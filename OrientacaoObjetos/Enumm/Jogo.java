<<<<<<< HEAD
package OrientacaoObjetos.Enumm;
=======
package Enumm;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Jogo {
  public static void main(String[] args) {

    Jogador j1 = new Jogador();
    j1.x = 10;
    j1.y = 10;

    j1.andar(Direcao.NORTE);
    j1.andar(Direcao.NORTE);
    j1.andar(Direcao.NORTE);
    j1.andar(Direcao.LESTE);

    System.out.println(j1.y);

  }
}
