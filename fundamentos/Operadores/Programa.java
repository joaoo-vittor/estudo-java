package fundamentos.Operadores;

public class Programa {
  public static void main(String[] args) {
    
    /*

      UNARIOS  |  BINARIOS  |  TERNARIOS
        a++        2 + 3       V ? V : V 

      PREFIX   |  POSFIX    |  INFIX
        ++a         a++        2 + 3

    */

    double x = 34.56;
    double y = 2.45;

    System.out.println(x + y);
    System.out.println(x - y);
    System.out.println(x * y);
    System.out.println(x / y);

    var a = 5;
    int b = 9;

    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);
    System.out.println(a / (double)b);

    System.out.println(a % b);

  }
}
