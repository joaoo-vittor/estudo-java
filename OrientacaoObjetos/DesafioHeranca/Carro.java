package DesafioHeranca;

public class Carro {

  final int VELOCIDADE_MAXIMA;
  protected int velocidade_atual = 0;

  protected Carro(int velocidade_maxima) {
    VELOCIDADE_MAXIMA = velocidade_maxima;
  }

  public void acelerar() {
    if (velocidade_atual + 5 > VELOCIDADE_MAXIMA) {
      velocidade_atual = VELOCIDADE_MAXIMA;
    }
    velocidade_atual += 5;
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

}
