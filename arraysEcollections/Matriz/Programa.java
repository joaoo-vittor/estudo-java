package Matriz;

import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a quantidade de alunos: ");
    int quantidadeAlunos = entrada.nextInt();

    System.out.print("Digite a quantidade de notas: ");
    int quantidadeNotas = entrada.nextInt();

    double[][] alunos = new double[quantidadeAlunos][quantidadeNotas];

    for (int i = 0; i < alunos.length; i++) {
      for (int j = 0; j < alunos[i].length; j++) {
        System.out.printf("Digite a %d° nota do aluno %d: ", j+1, i+1);
        alunos[i][j] = entrada.nextDouble();
      }
    }

    double total = 0;


    int numeroAluno = 1;
    for (double[] aluno : alunos) {
      for (double nota : aluno) {
        total += nota;
      }

      double media = total / quantidadeNotas;

      System.out.printf("Media do %d° aluno é %.2f\n", numeroAluno, media);

      numeroAluno++;
      media = 0;
      total = 0;
    }

    entrada.close();

  }
}
