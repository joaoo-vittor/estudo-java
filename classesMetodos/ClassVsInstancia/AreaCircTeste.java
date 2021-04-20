<<<<<<< HEAD
package classesMetodos.ClassVsInstancia;
=======
package ClassVsInstancia;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class AreaCircTeste {
  public static void main(String[] args) {
    
    AreaCirc a = new AreaCirc(5.6);
    // a.pi = 100000;

    // AreaCirc.PI = 3.14159;

    System.out.printf("Area: %.2f \n", a.area());
    System.out.printf("Area: %.2f \n", AreaCirc.area(15));
    System.out.println(AreaCirc.PI);
    System.out.println(Math.PI);

  }
}
