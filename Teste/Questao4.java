public class Questao4 {
  public static void main(String[] args) {
    int acc_par = 0;
    int acc_impar = 0;
    int qtd_par = 0;
    int qtd_impar = 0;

    for (int i = 0; i <= 100; i++) {
      if (i % 2 == 0) {
        acc_par += i;
        qtd_par++;
        continue;
      }
      acc_impar += i;
      qtd_impar++;
    }

    System.out.printf("Quantidade de pares: %d\n", qtd_par);
    System.out.printf("Quantidade de impares: %d\n", qtd_impar);
    System.out.printf("Somatorio dos valores pares %d\n", acc_par);
    System.out.printf("Somatorio dos valores impares %d\n", acc_impar);

  }
}
