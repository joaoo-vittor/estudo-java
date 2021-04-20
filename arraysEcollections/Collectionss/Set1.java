<<<<<<< HEAD
package arraysEcollections.Collectionss;
=======
package Collectionss;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.HashSet;
import java.util.Set;

public class Set1 {

  @SuppressWarnings({ "rawtypes", "unchecked" })
  public static void main(String[] args) {
    /*
    SET -> HashSet
    -> Pode ser Heterogêneo :(
    -> Pede ser Homogêneo :)
    -> Não Aceita Obj. Duplicados
    -> Pode ser Ordenado
    -> Nãp é Indexado
    */

    HashSet conjunto = new HashSet();

    conjunto.add(1.2);
    conjunto.add(true);
    conjunto.add("Teste");
    conjunto.add(1);

    System.out.println("Tamanho é "+ conjunto.size());

    conjunto.add("Teste 2");
    conjunto.add("Teste 2");
    conjunto.add(4);

    System.out.println("Tamanho é "+ conjunto.size());

    System.out.println(conjunto.remove("Teste"));
    System.out.println(conjunto.remove("Teste"));
    System.out.println(conjunto.remove(1));

    System.out.println("Tamanho é "+ conjunto.size());

    System.out.println(conjunto.contains(true));
    System.out.println(conjunto.contains(1.2));
    System.out.println(conjunto.contains("Teste"));


    Set numeros = new HashSet();

    numeros.add(1);
    numeros.add(2);
    numeros.add(3);

    System.out.println(numeros);
    System.out.println(conjunto);


    // conjunto.addAll(numeros); // União entre Conjuntos
    conjunto.retainAll(numeros);

    System.out.println(conjunto);

    conjunto.clear();

    System.out.println(conjunto);

  }
}
