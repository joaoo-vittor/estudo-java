package TratamentoErros.ExcecaoChecadaVsNaoChecada;

public class ChecadaVsNaoChecada {
  public static void main(String[] args) {

    try {
      geraErro1();
    } catch (Exception e) {
      System.out.println(e.getMessage());
      // e.printStackTrace();
    }

    try {
      geraErro2();
    } catch (Throwable e) {
      System.out.println(e.getMessage());
    }

    System.out.println("Fim :)");

  }

  // Exceção Não checada ou Não verificada
  static void geraErro1() {
    throw new RuntimeException("Ocorreu um erro #01!");
  }

  // Exceção checada ou verificada
  static void geraErro2() throws Exception {
    throw new Exception("Ocorreu um erro #02!");
    // try {
    //   throw new Exception("Ocorreu um erro #02!");
    // } catch (Exception e) {
    //   System.out.println(e.getMessage());
    // }
  }

}
