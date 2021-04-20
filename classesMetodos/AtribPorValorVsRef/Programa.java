<<<<<<< HEAD
package classesMetodos.AtribPorValorVsRef;

import classesMetodos.DesafioData.Data;
=======
package AtribPorValorVsRef;

import DesafioData.Data;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

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
