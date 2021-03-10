package Encapsulamento.CasaA;

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
