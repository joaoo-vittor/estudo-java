<<<<<<< HEAD
package TratamentoErros.ExcecaoPersonalizada;
=======
package ExcecaoPersonalizada;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Validar {

  private Validar() {}

  public static void aluno(Aluno aluno) {

    if (aluno == null) {
      throw new IllegalArgumentException("O aluno está nulo!");
    }

    if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
      throw new StringVaziaException("nome");
    }

    if (aluno.nota < 0 || aluno.nota > 10) {
      throw new NumeroForaIntervaloException("nota");
    }

  }


}
