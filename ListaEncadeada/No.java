public class No<T> {
  public No<T> prox;
  public T valor;

  public No(T valor) {
    this.valor = valor;
    this.prox = null;
  }
}
