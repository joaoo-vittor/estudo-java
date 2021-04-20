<<<<<<< HEAD
package OrientacaoObjetos.RelacionamentoUmParaUm;
=======
package RelacionamentoUmParaUm;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class CarroTeste {
  public static void main(String[] args) {

    Carro c1 = new Carro();

    System.out.println(c1.estaLigado());

    c1.ligar();
    System.out.println(c1.motor.giros());

    c1.acelerar();
    c1.acelerar();
    c1.acelerar();
    c1.acelerar();

    System.out.println(c1.motor.giros());

    c1.frear();
    c1.frear();
    c1.frear();
    c1.frear();
    c1.frear();
    c1.frear();
    c1.frear();
    c1.frear();

    // Faltou Encapsulamento!!!
    // c1.motor.fatorInjecao = -30;

    System.out.println(c1.motor.giros());

  }
}
