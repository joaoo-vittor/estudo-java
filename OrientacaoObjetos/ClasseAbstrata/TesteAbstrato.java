<<<<<<< HEAD
package OrientacaoObjetos.ClasseAbstrata;
=======
package ClasseAbstrata;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class TesteAbstrato {
  public static void main(String[] args) {

    Mamifero a = new Cachorro();
    System.out.println(a.mover());
    System.out.println(a.mamar());
    System.out.println(a.respirar());

  }
}
