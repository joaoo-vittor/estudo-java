<<<<<<< HEAD
package OrientacaoObjetos.Encapsulamento.CasaA;
=======
package Encapsulamento.CasaA;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Paulo {

  Ana esposa = new Ana();

  void testeAcessos() {
    // segredo não é possivel acessar, pois é privado
    // System.out.println(esposa.segredo);
    System.out.println(esposa.facoDentroDeCasa);
    System.out.println(esposa.formaDeFalar);
    System.out.println(esposa.todosSabem);
  }

}
