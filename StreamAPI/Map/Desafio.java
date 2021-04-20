<<<<<<< HEAD
package StreamAPI.Map;
=======
package Map;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
  public static void main(String[] args) {

    List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
    Consumer<Object> println = System.out::println;

    /*
    1. Número para string binaria... 6 => "110"
    2. Inverter a string... "110" => "011"
    3. Converter de volta para inteiro... "011" => 3
    */

    UnaryOperator<String> inverterString = (n) -> {
      String auxStr = "";
      for (int i = n.length(); i > 0; i--) {
        auxStr += n.charAt(i-1);
      }
      return auxStr;
    };

    nums.stream()
        .map(n -> Integer.toBinaryString(n))
        .map(inverterString)
        .map(n -> Integer.parseInt(n, 2))
        .forEach(println);


    System.out.println("################");

    UnaryOperator<String> inverter =
                  s -> new StringBuilder(s).reverse().toString();

    Function<String, Integer> BinarioParaInt =
                  s -> Integer.parseInt(s, 2);

    nums.stream()
        .map(Integer::toBinaryString)
        .map(inverter)
        .map(BinarioParaInt)
        .forEach(println);

  }
}
