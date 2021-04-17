import java.util.Scanner;

public class Questao9 {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite um numero com mais de 5 digitos: ");
    String numero = entrada.nextLine();

    // System.out.printf("%s\n", numero.substring(0, 1));
    for (int i = 0; i < numero.length(); i++) {
      System.out.printf("%s ", numero.substring(i, i+1));
    }
    System.out.println();

    entrada.close();

  }
}
