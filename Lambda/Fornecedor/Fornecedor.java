<<<<<<< HEAD
package Lambda.Fornecedor;
=======
package Fornecedor;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
  public static void main(String[] args) {

    Supplier<List<String>> umaLista =
            () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");

    Supplier<Object> umaLista2 =
            () -> Arrays.asList("Ana", "Bia", "Lia", "Gui");


    System.out.println(umaLista.get());
    System.out.println(umaLista2.get());


  }
}
