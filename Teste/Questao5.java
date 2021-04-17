public class Questao5 {
  public static void main(String[] args) {

    System.out.println("Jeito 1 de fazer");
    /*
    Com dois laços For de repetição
    */
    for (int i = 1; i < 11; i++) {
      for (int j = i; j >= 1 ; j--) {
        System.out.printf("%d ", j);
      }
      System.out.println();
    }


    System.out.println("\nJeito 2 de fazer");
    /*
      Com um laço While de repetição
    */
    int cont = 1;
    int iteracao = 2;
    int primeiro = 1;

    while (cont < iteracao) {
      if (cont == 1) {
        System.out.printf("%d \n", cont);
        iteracao++;
        primeiro++;
        cont = primeiro;
        continue;
      } else {
        if (cont <= 10) {
          System.out.printf("%d ", cont);
        }
      }

      if (cont == 2) {
        cont = 1;
      } else {
        cont--;
      }

      if (iteracao == 12) {
        break;
      }
    }

  }
}
