public class Main {
  public static void main(String[] args) {

    Revista r1 = new Revista("R1", 15.13, "Eumesmo1");
    Revista r2 = new Revista("R2", 35.23, "Eumesmo2");
    Revista r3 = new Revista("R3", 75.38, "Eumesmo3");
    Revista r4 = new Revista("R4", 90.86, "Eumesmo4");
    Colecao colecao = new Colecao();

    System.out.println("\nAdicionando Revistas:");
    colecao.incluirRevista(r1);
    colecao.incluirRevista(r2);
    colecao.incluirRevista(r3);
    colecao.incluirRevista(r4);
    colecao.exibirColecao();

    System.out.println("\nExcluindo Revista:");
    colecao.excluirRevista(r3);
    colecao.exibirColecao();

    System.out.println("\nAdicionando Revistas:");
    colecao.incluirRevista(r4);
    colecao.exibirColecao();

  }
}
