<<<<<<< HEAD
package fundamentos.Operadores;
=======
package Operadores;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Desafio {
  public static void main(String[] args) {
    
    int partA = 6 * (3 + 2);
    int resultPartA = (int) Math.pow(partA, 2);
    int totalPartA = resultPartA / (3 * 2);

    int partB = (1 - 5) * (2 - 7) / 2;
    int totalPartB = (int) Math.pow(partB, 2);

    int partC = totalPartA - totalPartB;
    int totalUp = (int) Math.pow(partC, 3); 

    int totalDown = (int) Math.pow(10, 3);

    int total = totalUp / totalDown;

    System.out.println(total);
  }
}
