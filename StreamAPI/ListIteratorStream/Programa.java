<<<<<<< HEAD
package StreamAPI.ListIteratorStream;
=======
package ListIteratorStream;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class Programa {
  public static void main(String[] args) {

    List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

    System.out.println("Usando o foreach...");
    for (String aluno: aprovados) {
      System.out.println(aluno);
    }

    System.out.println("\nUsando Iterator...");
    Iterator<String> it = aprovados.iterator();

    while(it.hasNext()) {
      System.out.println(it.next());
    }

    System.out.println("\nUsando Stream...");
    Stream<String> st = aprovados.stream();
    st.forEach(System.out::println); // Laço interno!!!

  }
}
