package ConversaoTiposPrim;

public class Programa {
  public static void main(String[] args) {
    
    /*
      FORMA IMPLICITA
      Byte -> Short -> Int -> Long
      Int -> Float
        Conversão nesse sentido não corre o risco de perder informação

      FORMA EXPLICITA
      Byte <-x- Short <-x- Int <-x- Long
      Int <-x- Float
        Conversão nesse sentido pode ocorrer perda de dados
    */
    
    // CAST

    double a = 1;
    System.out.println(a);

    float b = (float) 1.123548979987;
    System.out.println(b);

    int c = 432;
    byte d = (byte) c;

    System.out.println(d);

    double e = 1;
    int f = (int) e;
    System.out.println(f);

  }
}
