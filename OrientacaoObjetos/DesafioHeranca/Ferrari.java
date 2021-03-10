package DesafioHeranca;

public class Ferrari extends Carro {


  public Ferrari() {
    this(359);
  }

  public Ferrari(int velocidade_maxima) {
    super(velocidade_maxima);
  }

  // @Override
  // public void acelerar() {
  //   velocidade_atual += 15;
  // }
  // Não é possivel diminuir nivel de visibilidade, somente aumentar

}
