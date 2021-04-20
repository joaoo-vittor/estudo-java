<<<<<<< HEAD
package arraysEcollections.Collectionss;
=======
package Collectionss;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.HashSet;
// import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Set2 {
  public static void main(String[] args) {

    // Conjunto Homogêneo

    //    <String> -> Generics
    // Set<String> lista = new HashSet<String>();
    // Set<String> lista = new TreeSet<String>();
    SortedSet<String> lista = new TreeSet<String>();

    lista.add("Ana");
    lista.add("João");
    lista.add("Luca");
    lista.add("Jose");

    System.out.println(lista);

    for (String nome: lista) {
      System.out.println(nome);
    }

    Set<Integer> numeros = new HashSet<>();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);
    numeros.add(4);
    numeros.add(5);

    for (int numero: numeros) {
      System.out.println(numero);
    }

  }
}
