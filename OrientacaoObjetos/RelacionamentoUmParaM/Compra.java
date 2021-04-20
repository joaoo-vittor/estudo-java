<<<<<<< HEAD
package OrientacaoObjetos.RelacionamentoUmParaM;
=======
package RelacionamentoUmParaM;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.ArrayList;

public class Compra {

  String cliente;
  ArrayList<Item> itens = new ArrayList<Item>();

  void adicionarItem(String nome, int quantidade, double preco) {
    this.adicionarItem(new Item(nome, quantidade, preco));
  }

  void adicionarItem(Item item) {
    this.itens.add(item);
    item.compra = this;
  }

  double getValorTotal() {
    double total = 0;
    for (Item item: itens) {
      total += item.quantidade * item.preco;
    }
    return total;
  }

}
