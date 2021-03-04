package Arrray;

import java.util.Arrays;

public class Programa {
  public static void main(String[] args) {

    // Definição de Array
    double[] notasA = new double[4];

    notasA[0] = 5.98;
    notasA[1] = 7.44;
    notasA[2] = 9.80;
    notasA[3] = 6.21;

    String mostrar = Arrays.toString(notasA);

    System.out.println(mostrar);

    double totalNotasA = 0;
    for (int i = 0; i < notasA.length; i++) {
      totalNotasA += notasA[i];
    }

    System.out.printf("Média A: %.2f \n", totalNotasA / notasA.length);


    double[] notasB = { 6.69, 5.76, 7.02, 8.67 };

    double totalNotasB = 0;
    for (int i = 0; i < notasB.length; i++) {
      totalNotasB += notasB[i];
    }

    System.out.printf("Média B: %.2f \n", totalNotasB / notasB.length);




    // Matriz
    // double[][] matriz = new double[3][3];

  }
}
