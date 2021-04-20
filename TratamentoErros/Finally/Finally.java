<<<<<<< HEAD
package TratamentoErros.Finally;
=======
package Finally;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Scanner;

public class Finally {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    try {
      System.out.println(7 / entrada.nextInt());
    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      System.out.println("Finally...");
      entrada.close();
    }


  }
}
