<<<<<<< HEAD
package StreamAPI.Map;
=======
package Map;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.function.UnaryOperator;

public class Toools {

  private Toools() {}

  public final static UnaryOperator<String> maiuscula =
                                              n -> n.toUpperCase();
  public final static UnaryOperator<String> primeiraLetra =
                                              n -> n.charAt(0) + "";
  public final static String grito(String n) {
    return n + "!!!";
  }

}
