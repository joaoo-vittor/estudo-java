package GenericsEHeranca;

public class CaixaNumeroTeste {
  public static void main(String[] args) {
    
    // CaixaNumero<String> caixaA = new CaixaNumero<>();
    CaixaNumero<Integer> caixaA = new CaixaNumero<>();
    caixaA.guardar(159);
    System.out.println(caixaA.abrir());


  }
}
