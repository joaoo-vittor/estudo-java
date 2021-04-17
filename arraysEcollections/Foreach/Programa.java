package Foreach;

public class Programa {
  public static void main(String[] args) {

    double[] notas = { 6.69, 5.76, 7.02, 8.67 };

    // ForEach
    for (double nota : notas) {
      System.out.println(nota);
    }

    // for (int i = 0; i < notas.length; i++) {
    //   System.out.println(notas[i]);
    // }

  }
}
