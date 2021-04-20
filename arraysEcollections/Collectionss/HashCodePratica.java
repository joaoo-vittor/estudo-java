<<<<<<< HEAD
package arraysEcollections.Collectionss;
=======
package Collectionss;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.HashSet;

public class HashCodePratica {
  public static void main(String[] args) {

    HashSet<ListaUsuario> usuarios = new HashSet<>();

    usuarios.add(new ListaUsuario("Pedro"));
    usuarios.add(new ListaUsuario("Maria"));
    usuarios.add(new ListaUsuario("João"));
    usuarios.add(new ListaUsuario("Sophia"));

    boolean result = usuarios.contains(new ListaUsuario("João"));
    System.out.println(result);


  }
}
