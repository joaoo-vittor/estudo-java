package fundamentos.Wrapppers;

// import java.util.Scanner;

public class Programa {
  public static void main(String[] args) {
    //Wrappers são a versão objeto dos tipos primitivos!!!

    // Scanner entrada = new Scanner(System.in);

    Byte b = 100;
    Short s = 1000;
    Integer i = 10000;
    // Integer ii = Integer.parseInt(entrada.next());
    Long l = 1000000L;

    System.out.println(b.byteValue());
    System.out.println(s.toString());
    System.out.println(i * 3);
    System.out.println(l / 3);

    Float f = 123.102F;
    System.out.println(f);

    Double d = 1234.12123231;
    System.out.println(d);

    Boolean bo = Boolean.parseBoolean("true");

    System.out.println(bo);
    System.out.println(bo.toString().toUpperCase());

    Character c = '#';
    System.out.println(c + "....");

    // entrada.close();
  }
}
