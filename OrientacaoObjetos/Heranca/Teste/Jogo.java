<<<<<<< HEAD
package OrientacaoObjetos.Heranca.Teste;

import OrientacaoObjetos.Enumm.Direcao;
import OrientacaoObjetos.Heranca.Heroi;
import OrientacaoObjetos.Heranca.Monstro;
=======
package Heranca.Teste;

import Heranca.Direcao;
import Heranca.Heroi;
import Heranca.Monstro;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Jogo {
  public static void main(String[] args) {

    Monstro monstro = new Monstro(10, 10);
    Heroi heroi = new Heroi(10, 11);


    System.out.println("Monstro tem => "+ monstro.vida +" de vida!");
    System.out.println("Heroi tem => "+ heroi.vida +" de vida!");

    System.out.println();

    monstro.atacar(heroi);
    heroi.atacar(monstro);

    monstro.atacar(heroi);
    heroi.atacar(monstro);

    monstro.andar(Direcao.NORTE);
    monstro.atacar(heroi);
    heroi.atacar(monstro);

    System.out.println("Monstro tem => "+ monstro.vida +" de vida!");
    System.out.println("Heroi tem => "+ heroi.vida +" de vida!");

  }
}
