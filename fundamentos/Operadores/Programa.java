<<<<<<< HEAD
package fundamentos.Operadores;
=======
package Operadores;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

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
