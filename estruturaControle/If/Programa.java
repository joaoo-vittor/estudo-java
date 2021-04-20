package estruturaControle.If;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe a média: ");
    
    double media = entrada.nextDouble();

    if (media <= 10 && media >= 7.0) {
      System.out.println("Aprovado!!!");
    }

    entrada.close();
  }
}
