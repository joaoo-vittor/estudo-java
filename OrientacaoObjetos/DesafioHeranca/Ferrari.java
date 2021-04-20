<<<<<<< HEAD
package OrientacaoObjetos.DesafioHeranca;
=======
package DesafioHeranca;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Ferrari extends Carro implements Esportivo, Luxo {

  private boolean ligarTurbo = false;
  private boolean ligarAr = false;


  public Ferrari() {
    this(359);
  }

  public Ferrari(int velocidade_maxima) {
    super(velocidade_maxima);
  }

  @Override
  public void ligarTurbo() {
    ligarTurbo = true;
  }

  @Override
  public void desligarTurbo() {
    ligarTurbo = false;
  }

  @Override
  public void ligarAr() {
    ligarAr = true;
  }

  @Override
  public void desligarAr() {
    ligarAr = false;
  }

  @Override
  public int getDelta() {
    if (ligarTurbo && !ligarAr) {
      return 35;
    } else if (ligarTurbo && ligarAr) {
      return 30;
    } else if (!ligarTurbo && !ligarAr) {
      return 20;
    }
    return 15;
  }

  // @Override
  // public void acelerar() {
  //   velocidade_atual += 15;
  // }
  // Não é possivel diminuir nivel de visibilidade, somente aumentar

}
