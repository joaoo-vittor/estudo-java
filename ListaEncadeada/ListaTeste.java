public class ListaTeste {
  public static void main(String[] args) {

    Lista<Integer> listaNums = new Lista<>();

    listaNums.inserir(1);
    listaNums.inserir(2);
    listaNums.inserir(3);
    listaNums.inserir(4);
    listaNums.inserir(5);

    System.out.println(listaNums.exibirLista());

  }
}
