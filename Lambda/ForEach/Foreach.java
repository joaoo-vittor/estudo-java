package ForEach;

import java.util.Arrays;
import java.util.List;

public class Foreach {
  public static void main(String[] args) {

    List<String> aprovado = Arrays.asList("Ana", "Bia", "Lia", "Gui");

    System.out.println("Forama Tradicional...");
    for (String nome : aprovado) {
      System.out.println(nome);
    }


    System.out.println("\nLambda #01...");
    aprovado.forEach(nome -> System.out.println(nome + "!!!") );


    System.out.println("\nMethod Reference #01...");
    // Para cada elemento de aprovados chame System.out
    aprovado.forEach(System.out::println);


    System.out.println("\nLambda #02...");
    aprovado.forEach(nome -> meuPrint(nome));


    System.out.println("\nMethod Reference #02...");
    aprovado.forEach(Foreach::meuPrint);

  }

  static void meuPrint(String nome) {
    System.out.println("Olá, meu nome é " + nome);
  }

}
