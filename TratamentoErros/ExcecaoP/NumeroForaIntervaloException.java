<<<<<<< HEAD
package TratamentoErros.ExcecaoP;

// @SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception { 
=======
package ExcecaoP;

@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

  private String nomeAtributo;

  public NumeroForaIntervaloException(String nomeAtributo) {
    this.nomeAtributo = nomeAtributo;
  }

  public String getMessage() {
    return String.format("O atributo '%s' está fora do intervalo.", this.nomeAtributo);
  }

}
