import java.util.Scanner;

public class Questao7 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um ano: ");
    int ano = entrada.nextInt();

    if (ano % 4 == 0 || ano % 400 == 0) {
      System.out.printf("O ano %d é bissextos.\n", ano);
    } else {
      System.out.printf("O ano %d não é bissextos.\n", ano);
    }

    entrada.close();
  }
}
