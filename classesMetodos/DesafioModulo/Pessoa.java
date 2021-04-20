<<<<<<< HEAD
package classesMetodos.DesafioModulo;
=======
package DesafioModulo;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Pessoa {

  String nome;
  double peso;

  Pessoa(String nome, double peso) {
    this.nome = nome;
    this.peso = peso;
  }

  void comer(Comida comida) {
    if (comida != null) {
      this.peso += comida.pesoComida;
    }
  }

  String saudacao() {
    return "Olá, eu sou o/a " + this.nome + " e tenho " + this.peso + " Kgs.";
  }

}
