package BasicoSobreExcecao;

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
