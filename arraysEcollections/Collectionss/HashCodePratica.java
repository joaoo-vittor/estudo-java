package arraysEcollections.Collectionss;

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
