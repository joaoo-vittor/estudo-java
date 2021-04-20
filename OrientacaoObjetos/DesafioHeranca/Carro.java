<<<<<<< HEAD
package OrientacaoObjetos.DesafioHeranca;
=======
package DesafioHeranca;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Carro {

  final int VELOCIDADE_MAXIMA;
  protected int velocidade_atual = 0;
  private int delta = 5;

  protected Carro(int velocidade_maxima) {
    VELOCIDADE_MAXIMA = velocidade_maxima;
  }

  public void acelerar() {
    if (velocidade_atual + getDelta() > VELOCIDADE_MAXIMA) {
      velocidade_atual = VELOCIDADE_MAXIMA;
    }
    velocidade_atual += getDelta();
  }

  public void freiar() {
    if (velocidade_atual >= 5) {
      velocidade_atual -= 5;
    } else {
      velocidade_atual = 0;
    }
  }

  public String toString() {
    return "Velocidade atual é "+ velocidade_atual + " km/h";
  }

  public int getDelta() {
    return delta;
  }

  public void setDelta(int delta) {
    this.delta = delta;
  }

}
