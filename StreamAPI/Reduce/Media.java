<<<<<<< HEAD
package StreamAPI.Reduce;
=======
package Reduce;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Media {

  private double total;
  private int quantidade;

  public Media adicionar(double valor) {
    this.total += valor;
    this.quantidade++;
    return this;
  }

  public double getValor() {
    return total / quantidade;
  }

  public static Media combinar(Media m1, Media m2) {
    Media resultado = new Media();
    resultado.total = m1.total + m2.total;
    resultado.quantidade = m1.quantidade + m2.quantidade;
    return resultado;
  }

}
