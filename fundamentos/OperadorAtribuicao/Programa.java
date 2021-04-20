<<<<<<< HEAD
package fundamentos.OperadorAtribuicao;
=======
package OperadorAtribuicao;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Programa {
  public static void main(String[] args) {
    int a = 3;
    int b = a;
    int c = a + b;

    c += b;
    System.out.println(c);
    
    c -= b;
    System.out.println(c);
    
    c *= b;
    System.out.println(c);
    
    c /= b;
    System.out.println(c);
    
    c %= b;
    System.out.println(c);

  }
}
