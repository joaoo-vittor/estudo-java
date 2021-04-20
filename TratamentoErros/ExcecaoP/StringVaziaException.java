<<<<<<< HEAD
package TratamentoErros.ExcecaoP;

// @SuppressWarnings("serial")
=======
package ExcecaoP;

@SuppressWarnings("serial")
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce
public class StringVaziaException extends Exception {

  private String nomeAtributo;

  public StringVaziaException(String nomeAtributo) {
    this.nomeAtributo = nomeAtributo;
  }

  public String getMessage() {
    return String.format("O atributo '%s' está vazio.", this.nomeAtributo);
  }

}
