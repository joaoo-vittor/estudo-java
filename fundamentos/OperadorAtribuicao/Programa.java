package OperadorAtribuicao;

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
