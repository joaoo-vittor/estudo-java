<<<<<<< HEAD
package OrientacaoObjetos.Desafio1;
=======
package Desafio1;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.ArrayList;
import java.util.List;

public class Cliente {

  final String nome;
  final List<Compra> compras = new ArrayList<>();

  Cliente(String nome) {
    this.nome = nome;
  }

  void adicionarCompra(Compra compra) {
    this.compras.add(compra);
  }

  double obterValorTotal() {
    double total = 0;

    for(Compra compra: compras) {
      total += compra.valorTotal();
    }

    return total;
  }

}
