<<<<<<< HEAD
package OrientacaoObjetos.Polimorfismo;
=======
package Polimorfismo;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public abstract class Comida {
  // Super classe

  private double peso;

  public Comida(double peso) {
    setPeso(peso);
  }

  public void setPeso(double peso) {
    if (peso >= 0) {
      this.peso = peso;
    }
  }

  public double getPeso() {
    return peso;
  }

}
