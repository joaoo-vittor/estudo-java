<<<<<<< HEAD
package Teste;

=======
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int op;
    System.out.println("Digite um numero: ");

    op = sc.nextInt();
		switch (op) {
			case 1:
				System.out.println("1");
        break;
			case 2:
				System.out.println("2");
        break;
			case 3:
				System.out.println("3");
        break;
			default:
				System.out.println("Número diferente de 1, 2 e 3.");

		}

    sc.close();

  }
}
