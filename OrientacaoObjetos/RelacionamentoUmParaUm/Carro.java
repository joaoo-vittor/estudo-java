<<<<<<< HEAD
package OrientacaoObjetos.RelacionamentoUmParaUm;
=======
package RelacionamentoUmParaUm;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Carro {

  final Motor motor;

  Carro() {
    this.motor = new Motor(this);
  }

  void acelerar() {
    if (motor.fatorInjecao < 2.5) {
      motor.fatorInjecao += 0.4;
    }
  }

  void frear() {
    if (motor.fatorInjecao > 0.5) {
      motor.fatorInjecao -= 0.4;
    }
  }

  void ligar() {
    motor.ligado = true;
  }

  void desligar() {
    motor.ligado = false;
  }

  boolean estaLigado() {
    return motor.ligado;
  }

}
