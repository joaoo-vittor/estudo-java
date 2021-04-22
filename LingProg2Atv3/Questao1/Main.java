public class Main {
  public static void main(String[] args) {

    Revista r1 = new Revista("Revista 1", 15.13, "Autor 1");
    Revista r2 = new Revista("Revista 2", 35.23, "Autor 2");
    Revista r3 = new Revista("Revista 3", 75.38, "Autor 3");
    Revista r4 = new Revista("Revista 4", 90.86, "Autor 4");
    Colecao colecao = new Colecao();

    System.out.println("\nAdicionando Revistas:");
    colecao.incluirRevista(r1);
    colecao.incluirRevista(r2);
    colecao.incluirRevista(r3);
    colecao.incluirRevista(r4);
    colecao.exibirColecao();

    System.out.println("\nExcluindo a Revista 3 Revista:");
    colecao.excluirRevista(r3);
    colecao.exibirColecao();

    System.out.println("\nAdicionando Revistas:");
    colecao.incluirRevista(r4);
    colecao.exibirColecao();

    System.out.println("\nExcluindo a Revista 3 Revista:");
    colecao.excluirRevista(r3);

  }
}
