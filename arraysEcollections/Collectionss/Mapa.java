<<<<<<< HEAD
package arraysEcollections.Collectionss;
=======
package Collectionss;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
  public static void main(String[] args) {

    Map<Integer, String> usuarios =  new HashMap<>();

    usuarios.put(1, "João");
    usuarios.put(1, "João Vitor");
    usuarios.put(2, "Vitoria");
    usuarios.put(3, "Jose");

    System.out.println(usuarios.size());
    System.out.println(usuarios.isEmpty());

    System.out.println(usuarios.keySet());
    System.out.println(usuarios.values());
    System.out.println(usuarios.entrySet());

    System.out.println(usuarios.containsKey(3));
    System.out.println(usuarios.containsValue("João Vitor"));

    System.out.println(usuarios.get(2));

    for (int chave: usuarios.keySet()) {
      System.out.println(chave);
    }

    for (String valor : usuarios.values()) {
      System.out.println(valor);
    }

    for (Entry<Integer, String> registro : usuarios.entrySet()) {
      System.out.print(registro.getKey() + " ===> ");
      System.out.println(registro.getValue());
    }

  }
}
