<<<<<<< HEAD
package arraysEcollections.Equalss;
=======
package Equalss;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class ProgramaTeste {
  public static void main(String[] args) {

    Usuario user1 = new Usuario();
    user1.nome = "joao vitor";
    user1.email = "joao.vitor@gmail.com";

    Usuario user2 = new Usuario();
    user2.nome = "joao vitor";
    user2.email = "joao.vitor@gmail.com";

    System.out.println(user1 == user2);
    System.out.println(user1.equals(user2));
    System.out.println(user2.equals(user1));

    // System.out.println(user2.equals(new Date()));


  }
}
