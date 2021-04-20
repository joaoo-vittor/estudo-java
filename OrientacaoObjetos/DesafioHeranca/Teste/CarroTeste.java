<<<<<<< HEAD
package OrientacaoObjetos.DesafioHeranca.Teste;

import OrientacaoObjetos.DesafioHeranca.Carro;
import OrientacaoObjetos.DesafioHeranca.Civic;
import OrientacaoObjetos.DesafioHeranca.Ferrari;
=======
package DesafioHeranca.Teste;

import DesafioHeranca.Carro;
import DesafioHeranca.Civic;
import DesafioHeranca.Ferrari;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class CarroTeste {
  public static void main(String[] args) {

    Ferrari ferrari = new Ferrari();
    Carro civic = new Civic();

    System.out.println("Velocidade Ferrari "+ferrari);

    ferrari.ligarTurbo();
    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.ligarAr();

    System.out.println(ferrari.nivelDoAr());

    ferrari.freiar();
    ferrari.freiar();
    ferrari.freiar();
    ferrari.freiar();
    ferrari.freiar();

    System.out.println("Velocidade Ferrari "+ferrari);

    System.out.println("Velocidade Civic "+civic);

    civic.acelerar();
    civic.acelerar();
    civic.acelerar();
    civic.acelerar();

    civic.freiar();
    civic.freiar();
    civic.freiar();
    civic.freiar();
    civic.freiar();


    System.out.println("Velocidade Civic "+civic);

  }
}
