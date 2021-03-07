package RelacionamentoUmParaM;

public class CompraTeste {
  public static void main(String[] args) {

    Compra compra1 = new Compra();

    compra1.cliente = "João Vitor";
    compra1.adicionarItem("Caneta", 20, 8.96);
    compra1.adicionarItem(new Item("Borracha", 7, 3.69));
    compra1.adicionarItem(new Item("Caderno", 4, 18.96));

    System.out.println(compra1.itens.size());
    System.out.println(compra1.getValorTotal());

  }
}
