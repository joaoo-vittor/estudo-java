package fundamentos.OperadoresLogicos;

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
