package Desafio1;

public class Sistema {
  public static void main(String[] args) {


    Compra compra1 = new Compra();
    compra1.adicionarItem("Caneta", 1.54, 50);
    compra1.adicionarItem(new Produto("NoteBook", 1999.96), 1);

    Compra compra2 = new Compra();
    compra2.adicionarItem("Caderno", 7.54, 50);
    compra2.adicionarItem(new Produto("iPhone", 5999.96), 1);


    Cliente cliente = new Cliente("joao");
    cliente.adicionarCompra(compra1);
    cliente.compras.add(compra2);

    System.out.println(cliente.obterValorTotal());
    System.out.println((7.54 * 50) + (1.54 * 50) + 1999.96 + 5999.96);

  }
}
