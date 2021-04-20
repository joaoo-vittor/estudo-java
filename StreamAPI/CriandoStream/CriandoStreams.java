<<<<<<< HEAD
package StreamAPI.CriandoStream;
=======
package CriandoStream;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {
  public static void main(String[] args) {

    Consumer<String> print = System.out::print;
    // Consumer<Integer> println = System.out::println;


    Stream<String> langs = Stream.of("Java ", "Python ", "JS\n");
    langs.forEach(print);

    String[] maisLangs = { "Python ", "Lisp ", "Pearl ", "Go\n" };

    Stream.of(maisLangs).forEach(print);
    Arrays.stream(maisLangs).forEach(print);
    Arrays.stream(maisLangs, 1, 2).forEach(print);
    System.out.println();
    Arrays.stream(maisLangs, 1, 3).forEach(print);
    System.out.println();
    Arrays.stream(maisLangs, 1, 4).forEach(print);

    System.out.println("#####################");

    List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
    outrasLangs.stream().forEach(print);

    System.err.println("Paralelo");

    outrasLangs.parallelStream().forEach(print);


    // Stream.generate(() -> "a").forEach(print); // Stream Infinita!!!
    // Stream.iterate(0, n -> n + 1).forEach(println); // Stream Infinita!!!


  }
}
