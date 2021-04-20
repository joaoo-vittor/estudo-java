<<<<<<< HEAD
package OrientacaoObjetos.DesafioHeranca;
=======
package DesafioHeranca;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public interface Luxo {

  void ligarAr();
  void desligarAr();

  default int nivelDoAr() {
    return 1;
  }

}
