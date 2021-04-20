package estruturaControle.DoWhile;

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
