package classesMetodos.AtribPorValorVsRef;

import classesMetodos.DesafioData.Data;

public class Programa {
  public static void main(String[] args) {

    double a = 2;
    double b = a;

    a++;
    b--;

    System.out.println(a + " " + b);

    Data d1 = new Data(31, 12, 2021);
    Data d2 = d1;

    d2.dia = 15;

    System.out.println(d1.dataFormatada());
    System.out.println(d2.dataFormatada());


  }
}
