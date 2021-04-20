package OrientacaoObjetos.Encapsulamento;

public class PessoaTeste {
  public static void main(String[] args) {

    Pessoa p1 = new Pessoa("João Vitor", "Silva",-22);

    // p1.idade = -30; // altera
    // p1.setIdade(-30);

    System.out.println(p1.getIdade()); // ler
    System.out.println(p1.getNomeCompleto()); // ler
    System.out.println(p1); // ler

  }
}
