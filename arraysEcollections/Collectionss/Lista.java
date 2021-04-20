<<<<<<< HEAD
package arraysEcollections.Collectionss;
=======
package Collectionss;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.ArrayList;

public class Lista {
  public static void main(String[] args) {
    /*
    SET -> HashSet
    -> Pode ser Heterogêneo :(
    -> Pede ser Homogêneo :)
    -> Aceita Obj. Duplicados
    -> É Ordenado
    -> É Indexado
    */

    ArrayList<ListaUsuario> lista = new ArrayList<>();

    ListaUsuario u1 = new ListaUsuario("Ana");

    lista.add(u1);
    lista.add(new ListaUsuario("João"));
    lista.add(new ListaUsuario("Jose"));
    lista.add(new ListaUsuario("Maria"));
    lista.add(new ListaUsuario("Cangela"));

    System.out.println(lista.get(4));
    System.out.println(lista.get(4).nome);

    lista.remove(0);
    System.out.println(lista.remove(new ListaUsuario("João")));

    System.out.println(lista.contains(new ListaUsuario("Cangela")));

    for (ListaUsuario user: lista) {
      System.out.println(user.nome);
    }

  }
}
