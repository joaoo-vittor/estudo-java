<<<<<<< HEAD
package estruturaControle.DoWhile;
=======
package DoWhile;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    String texto = "";

    do {
      System.out.print("Você diz: ");
      texto = entrada.nextLine();
    } while (!texto.equalsIgnoreCase("sair"));

    entrada.close();

  }
}
