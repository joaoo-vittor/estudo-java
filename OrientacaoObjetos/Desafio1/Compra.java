<<<<<<< HEAD
package OrientacaoObjetos.Desafio1;
=======
package Desafio1;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.ArrayList;
import java.util.List;

public class Compra {

  final List<Item> itens = new ArrayList<Item>();

  void adicionarItem(Produto prod, int qtde) {
    this.itens.add(new Item(prod, qtde));
  }

  void adicionarItem(String nome, double preco, int qtde) {
    var produto = new Produto(nome, preco);
    this.itens.add(new Item(produto, qtde));
  }

  double valorTotal() {
    double total = 0;

    for (Item item: itens) {
      total += item.quantidade * item.produto.preco;
    }

    return total;
  }

}
