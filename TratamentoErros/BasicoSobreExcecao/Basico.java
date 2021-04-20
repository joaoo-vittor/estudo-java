<<<<<<< HEAD
package TratamentoErros.BasicoSobreExcecao;
=======
package BasicoSobreExcecao;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Basico {
  public static void main(String[] args) {

    Aluno a1 = null;

    try {
      imprimirAluno(a1);
    } catch (Exception excecao) {
      System.out.println("Ocorreu um erro "+ excecao.getMessage());
    }

    try {
      System.out.println(7 / 0);
    } catch (Exception excecao) {
      System.out.println("Não pode dividir por ZERO!");
    }

    System.out.println("Fim: :)");

  }

  public static void imprimirAluno(Aluno aluno) {
    System.out.println(aluno.nome);
  }

}
