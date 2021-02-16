package IguadadeString;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    System.out.println("2" == "2");

    String a = new String("2");
    System.out.println("2" == a);
    System.out.println("2".equals(a));

    Scanner entrada = new Scanner(System.in);

    String s = entrada.nextLine();
    System.out.println(s);
    System.out.println("2" == s.trim());
    System.out.println("2".equals(s.trim()));

    entrada.close();

  }
}
