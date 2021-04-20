<<<<<<< HEAD
package arraysEcollections.Equalss;
=======
package Equalss;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Usuario {

  String nome;
  String email;

  public boolean equals(Object obj) {

    if (obj instanceof Usuario) {
      Usuario outro = (Usuario) obj;

      boolean nomeIgual = outro.nome.equals(this.nome);
      boolean emailIgual = outro.email.equals(this.email);

      return nomeIgual && emailIgual;
    }

    return false;

  }

}
