<<<<<<< HEAD
package OrientacaoObjetos.RelacionamentoUmParaUm;
=======
package RelacionamentoUmParaUm;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

public class Motor {

  final Carro carro;

  double fatorInjecao = 1;
  boolean ligado = false;

  Motor(Carro carro) {
    this.carro = carro;
  }

  int giros() {
    if (ligado) {
      return (int) Math.round(fatorInjecao * 3000);
    }
    return 0;
  }



}
