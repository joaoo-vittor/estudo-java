<<<<<<< HEAD
package OrientacaoObjetos.Polimorfismo;
=======
package Polimorfismo;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Pessoa {
  private double peso;

  public Pessoa(double peso) {
    setPeso(peso);
  }

  public void comer(Comida comida) { // metedo mais abrangente
    this.peso += comida.getPeso();
  }

  // public void comer(Feijao feijao) {
  //   this.peso += feijao.getPeso();
  // }

  // public void comer(Sorvete sorvete) {
  //   this.peso += sorvete.getPeso();
  // }

  public void setPeso(double peso) {
    if (peso >= 0) {
      this.peso = peso;
    }
  }

  public double getPeso() {
    return peso;
  }
}
