package BasicoCOMGenerics;

public class CaixaTeste {
  public static void main(String[] args) {

    Caixa<Double> caixaA = new Caixa<>();
    caixaA.guardar(22.5);

    Double coisaA = (Double) caixaA.abrir();
    System.out.println(coisaA);
    
    Caixa<String> caixaB = new Caixa<>();
    caixaB.guardar("Hello World");

    String coisaB = caixaB.abrir();
    System.out.println(coisaB);

  }
}
