package TratamentoErros.ExcecaoP;

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
