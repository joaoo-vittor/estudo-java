package RelacionamentoUmParaUm;

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
