<<<<<<< HEAD
package estruturaControle.IfElse;

=======
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
import javax.swing.JOptionPane;

public class Programa {
  public static void main(String[] args) {
    
    String valor = JOptionPane.showInputDialog("Informe um número: ");
    int numero = Integer.parseInt(valor);
    
    if (numero % 2 == 0) {
      System.out.println("Número par!!!");
    } else {
      System.out.println("Número impar!!!");
    }
    
  }
}

