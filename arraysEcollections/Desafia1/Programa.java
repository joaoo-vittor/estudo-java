package Desafia1;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a quantidade de notas: ");
    int quantidadeNotas = entrada.nextInt();

    double[] notas = new double[quantidadeNotas];

    for (int i = 0; i < notas.length; i++) {
      System.out.printf("Digite a %d° nota: ", i+1);
      notas[i] = entrada.nextDouble();
    }

    double total = 0;
    for (double nota: notas) {
      total += nota;
    }

    double media = total / quantidadeNotas;

    System.out.printf("Media do aluno é %.2f\n", media);

    entrada.close();

  }
}
