package PrimeiraFuncao;

public class CalculoTeste2 {
  public static void main(String[] args) {

    // Lambda do Tipo Calculo
    Calculo calc = (x, y) -> {
      return x + y;
    };

    System.out.println(calc.execultar(2, 5));

    calc = (x, y) -> x * y;
    System.out.println(calc.execultar(3, 5));

  }
}
