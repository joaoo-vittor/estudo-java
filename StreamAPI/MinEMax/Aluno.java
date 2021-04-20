<<<<<<< HEAD
package StreamAPI.MinEMax;
=======
package MinEMax;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Aluno {

  final String nome;
  final double nota;
  final boolean bomComportamento;

  public Aluno(String nome, double nota) {
    this(nome, nota, true);
  }

  public Aluno(String nome, double nota, boolean bomComportamento) {
    this.nome = nome;
    this.nota = nota;
    this.bomComportamento = bomComportamento;
  }

  public String toString() {
    return this.nome + " tem nota " + this.nota;
  }

}
