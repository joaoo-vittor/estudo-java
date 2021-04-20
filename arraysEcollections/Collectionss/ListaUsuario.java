<<<<<<< HEAD
package arraysEcollections.Collectionss;
=======
package Collectionss;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class ListaUsuario {

  String nome;

  ListaUsuario(String nome) {
    this.nome = nome;
  }

  @Override
  public String toString() {
    return "Meu nome é " + this.nome + ".";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((nome == null) ? 0 : nome.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != this.getClass())
      return false;
    ListaUsuario other = (ListaUsuario) obj;
    if (nome == null) {
      if (other.nome != null) {
        return false;
      }
    } else if (!nome.equals(other.nome))
      return false;
    return true;
  }

}
