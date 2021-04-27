public class Lista<T> {

  No<T> inicio;

  public Lista() {
    this.inicio = null;
  }

  /*

  inicio
  prox ->

  */

  public boolean vazio() {
    return this.inicio == null;
  }

  public boolean busca(T elemento) {
    for (No<T> no = this.inicio; no != null; no = no.prox) {
      if (no.valor == elemento) {
        return true;
      }
    }
    return false;
  }

  public void inserirNoInicio(T elemento) {
    No<T> novoNo = new No<>(elemento);
    novoNo.prox = this.inicio;
    this.inicio = novoNo;
  }

  public void inserir(T elemento) {
    if (this.inicio == null) {
      No<T> novoNo = new No<>(elemento);
      novoNo.prox = null;
      this.inicio = novoNo;
      return;
    }

    No<T> noAux = this.inicio.prox;
    No<T> no = this.inicio;
    for (int i = 0; i < this.getTamanhoLista(); i++) {
      if (noAux == null) {
        No<T> novoNo = new No<>(elemento);
        novoNo.prox = null;
        no.prox = novoNo;
        return;
      }
      no = no.prox;
      noAux = noAux.prox;
    }
  }

  public int getTamanhoLista() {
    int tam = 0;
    for (No<T> no = this.inicio; no != null; no = no.prox) {
      tam++;
    }
    return tam;
  }

  public void removerInicio() {
    this.inicio = this.inicio.prox;
  }

  public String exibirLista() {
    if (this.vazio()) {
      return "";
    }

    String str = "Lista encadeada: ";
    for (No<T> no = this.inicio; no != null; no = no.prox) {
      str+=" "+no.valor;
    }
    return str;
  }

}
