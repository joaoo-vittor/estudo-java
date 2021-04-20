package OrientacaoObjetos.Encapsulamento.CasaB;

import OrientacaoObjetos.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

  void testeAcessos() {

    // Ana mae = new Ana();

    // System.out.println(mae.segredo);
    // System.out.println(mae.facoDentroDeCasa);

    // transmitido por herança, não criando uma instancia
    System.out.println(formaDeFalar);
    System.out.println(todosSabem);
    System.out.println(new Ana().todosSabem);

  }

}
