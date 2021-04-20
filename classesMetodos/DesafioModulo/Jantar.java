<<<<<<< HEAD
package classesMetodos.DesafioModulo;
=======
package DesafioModulo;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Jantar {

  public static void main(String[] args) {

    Comida c1 = new Comida("Arroz", 0.200);
    Comida c2 = new Comida("Feijão", 0.300);

    Pessoa p = new Pessoa("João", 99.5);

    System.out.println(p.saudacao());
    p.comer(c1);
    System.out.println(p.saudacao());
    p.comer(c2);
    System.out.println(p.saudacao());

  }
}
