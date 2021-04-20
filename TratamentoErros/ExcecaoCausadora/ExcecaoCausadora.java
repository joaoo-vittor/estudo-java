<<<<<<< HEAD
package TratamentoErros.ExcecaoCausadora;
=======
package ExcecaoCausadora;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class ExcecaoCausadora {
  public static void main(String[] args) {

    try {
      metodoA(null);
    } catch (IllegalArgumentException e) {
      if (e.getCause() != null) {
        System.out.println(e.getCause().getMessage());
      }
    }

  }

  static void metodoA(Aluno aluno) {

    try {
      metodoB(aluno);
    } catch (Exception causa) {
      throw new IllegalArgumentException(causa);
    }
  }

  static void metodoB(Aluno aluno) {
    if (aluno == null) {
      throw new NullPointerException("Aluno está NULO!!!!");
    }

    System.out.println(aluno.nome);
  }

}
