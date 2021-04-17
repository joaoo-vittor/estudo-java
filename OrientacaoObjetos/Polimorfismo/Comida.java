package Polimorfismo;

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
