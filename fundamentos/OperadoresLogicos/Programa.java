<<<<<<< HEAD
package fundamentos.OperadoresLogicos;
=======
package OperadoresLogicos;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Programa {
  public static void main(String[] args) {
    /*
      Operadores Logicos

      E            -> &&
      OU           -> ||
      OU EXCLUSIVO -> ^
      NÃO          -> !

    */

    boolean cond1 = true;
    boolean cond2 = 3 > 7;

    System.out.println(cond1 && cond2); // AND 
    System.out.println(cond1 || cond2); // OR
    System.out.println(cond1 ^ cond2); // XOR 
    System.out.println(!cond1);
    System.out.println(!!cond1);
    System.out.println(!cond2);

    System.out.println("\nTabela Verdade E (AND)");
    System.out.println(true && true);
    System.out.println(true && false);
    // System.out.println(false && true);
    // System.out.println(false && false);

    System.out.println("\nTabela Verdade OU (OR)");
    // System.out.println(true || true);
    // System.out.println(true || false);
    System.out.println(false || true);
    System.out.println(false || false);

    System.out.println("\nTabela Verdade OU EXCLUSIVO (XOR)");
    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);

  }
}
