package DesafioHeranca.Teste;

import DesafioHeranca.Carro;
import DesafioHeranca.Civic;
import DesafioHeranca.Ferrari;

public class CarroTeste {
  public static void main(String[] args) {

    Ferrari ferrari = new Ferrari();
    Carro civic = new Civic();

    System.out.println("Velocidade Ferrari "+ferrari);

    ferrari.acelerar();
    ferrari.acelerar();
    ferrari.acelerar();

    ferrari.freiar();
    ferrari.freiar();
    ferrari.freiar();
    ferrari.freiar();
    ferrari.freiar();
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
