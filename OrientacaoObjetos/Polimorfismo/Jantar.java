package OrientacaoObjetos.Polimorfismo;

public class Jantar {
  public static void main(String[] args) {

    Pessoa pessoa = new Pessoa(99.50);

    Arroz ingrediente1 = new Arroz(0.25);
    Feijao ingrediente2 = new Feijao(0.180);
    // Comida ingrediente3 = new Comida(0.40);
    Comida ingrediente3 = new Arroz(0.40);

    System.out.println(pessoa.getPeso());

    pessoa.comer(ingrediente1);
    pessoa.comer(ingrediente2);
    pessoa.comer(ingrediente3);

    System.out.println(pessoa.getPeso());

    Sorvete sobremesa = new Sorvete(0.4);

    pessoa.comer(sobremesa);

    System.out.println(pessoa.getPeso());

  }
}
