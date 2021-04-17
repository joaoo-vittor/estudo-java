package NotacaoPonto;

public class Programa {
  public static void main(String[] args) {
    String s = "Bom dia X";

    s = s.replace("X", "Senhora");
    s = s.toUpperCase();
    s = s.concat("!!!!");

    System.out.println(s);

    String y = "Bom dia X".replace("X", "João Vitor");
    System.out.println(y);
    System.out.println(y.length());
  }
}
