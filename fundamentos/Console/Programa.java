<<<<<<< HEAD
package fundamentos.Console;
=======
package Console;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    
    Scanner entrada =  new Scanner(System.in);
    
    System.out.println("Digite seu nome: ");
    String nome = entrada.nextLine();

    System.out.println("Digite o seu sobrenome: ");
    String sobrenome = entrada.nextLine();

    System.out.println("Digite sua idade: ");
    int idade = entrada.nextInt();

    System.out.printf("\nNome: %s %s\nIdade: %d \n", nome, sobrenome, idade);

    entrada.close();
  }
}
