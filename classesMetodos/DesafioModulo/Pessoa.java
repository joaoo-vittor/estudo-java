package DesafioModulo;

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
