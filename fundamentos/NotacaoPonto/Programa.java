<<<<<<< HEAD
package fundamentos.NotacaoPonto;
=======
package NotacaoPonto;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

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
