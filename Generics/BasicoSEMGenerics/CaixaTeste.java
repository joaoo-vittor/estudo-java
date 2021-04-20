package BasicoSEMGenerics;

public class CaixaTeste {
  public static void main(String[] args) {

    Caixa caixaA = new Caixa();
    caixaA.guardar(22.5);

    Double coisaA = (Double) caixaA.abrir();
    System.out.println(coisaA);
    
    Caixa caixaB = new Caixa();
    caixaB.guardar(22.5);

    Integer coisaB = (Integer) caixaA.abrir();
    System.out.println(coisaB);

  }
}
