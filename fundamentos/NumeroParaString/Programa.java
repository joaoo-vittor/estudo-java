<<<<<<< HEAD
package fundamentos.NumeroParaString;
=======
package NumeroParaString;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Programa {
  public static void main(String[] args) {

    Integer num1 = 10000;
    System.out.println(num1.toString().length());

    int num2 = 100000;
    System.out.println(Integer.toString(num2).length());

    System.out.println(("" + num1).length());
    System.out.println(("" + num2).length());

  }
}
