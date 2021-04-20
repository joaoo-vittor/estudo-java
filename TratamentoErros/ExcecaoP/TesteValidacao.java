<<<<<<< HEAD
package TratamentoErros.ExcecaoP;
=======
package ExcecaoP;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class TesteValidacao {
  public static void main(String[] args) {

    try {
      Aluno a1 = new Aluno("João", 7);
      Validar.aluno(a1);

      Validar.aluno(null);
    } catch (StringVaziaException e) {
      System.out.println(e.getMessage());
    } catch (NumeroForaIntervaloException | IllegalArgumentException e) {
      System.out.println(e.getMessage());
    }

    try {
      Validar.aluno(null);
    } catch (StringVaziaException e) {
      e.printStackTrace();
    } catch (NumeroForaIntervaloException e) {
      e.printStackTrace();
    }

    System.out.println("Fim :)");

  }
}
