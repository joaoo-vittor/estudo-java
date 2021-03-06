<<<<<<< HEAD
package StreamAPI.Reduce;
=======
package Reduce;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

    BinaryOperator<Integer> soma = (acc, n) -> acc + n;

    Integer total = nums.stream()
        .reduce(soma)
        .get();

    System.out.println(total);

    // Para 100 para cada execulção paralela
    Integer total2 = nums.parallelStream().reduce(100, soma);

    System.out.println(total2);

    Integer total3 = nums.stream().reduce(100, soma);

    System.out.println(total3);

    // Resultado foi um Opcional<Integer>...
    nums.stream()
        .filter(n -> n > 5)
        .reduce(soma)
        .ifPresent(System.out::println);

  }
}
