<<<<<<< HEAD
package fundamentos.DesafioConversao;
=======
package DesafioConversao;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    
    Scanner entrada = new Scanner(System.in);

    System.out.print("Informe o 1° salario: ");
    String valor1 = entrada.next().replace(",", ".");
    
    System.out.print("Informe o 2° salario: ");
    String valor2 = entrada.next().replace(",", ".");
    
    System.out.print("Informe o 3° salario: ");
    String valor3 = entrada.next().replace(",", ".");

    double salario1 = Double.parseDouble(valor1);
    double salario2 = Double.parseDouble(valor2);
    double salario3 = Double.parseDouble(valor3);

    double media = (salario1 + salario2 + salario3) / 3;

    System.out.printf("Media de salario: %.2f \n", media);

    entrada.close();

  }
}
