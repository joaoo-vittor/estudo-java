package DesafioData;

public class DataTeste {
  public static void main(String[] args) {
    
    Data d1 = new Data();
    // d1.dia = 18;
    // d1.mes = 2;
    // d1.ano = 2021;

    System.out.printf("%d/%d/%d\n", d1.dia, d1.mes, d1.ano);

    System.out.println(d1.dataFormatada());

    Data d2 = new Data(18, 2, 2021);

    System.out.println(d2.dataFormatada());

  }
}
