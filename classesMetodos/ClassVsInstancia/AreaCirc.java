<<<<<<< HEAD
package classesMetodos.ClassVsInstancia;
=======
package ClassVsInstancia;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class AreaCirc {
  
  double raio;
  final static double PI = 3.14159;

  AreaCirc(double raioInicial) {
    raio = raioInicial; 
  }

  double area() {
    return PI * Math.pow(raio, 2);
  }
  
  static double area(double raio) {
    return PI * Math.pow(raio, 2);
  }

}
