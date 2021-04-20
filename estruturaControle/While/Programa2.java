<<<<<<< HEAD
package estruturaControle.While;
=======
package While;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Scanner;

public class Programa2 {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    String valor = "";

    while (!valor.equalsIgnoreCase("sair")) {
      System.out.print("Voce diz: ");
      valor = entrada.nextLine();
    }

    entrada.close();

  }
}
