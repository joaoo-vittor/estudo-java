public class MainQuestao3 {
  public static void main(String[] args) {

    Baralho baralho = new Baralho();
    System.out.println("\nImprimindo o baralho: ");
    baralho.imprimiBaralho();

    System.out.println("\nEmabaralhando o baralho: ");
    baralho.embaralha();
    baralho.imprimiBaralho();

    System.out.println("\nBuscando carta no Baralho: ");
    Carta carta1 = new Carta("COPAS", "REI");
    Carta carta2 = new Carta("ESPADA", "9");

    System.out.printf(" A carta %s de %s foi encontrada: %s \n",
    carta1.getNaipe(), carta1.getNome(), baralho.temCarta(carta1));
    System.out.printf(" A carta %s de %s foi encontrada: %s \n",
    carta2.getNaipe(), carta2.getNome(), baralho.temCarta(carta2));

    System.out.println("\nRetirando cartas do topo baralho: ");

    Carta carta3 = baralho.tirarCartaTopo();
    Carta carta4 = baralho.tirarCartaTopo();
    baralho.embaralha();
    Carta carta5 = baralho.tirarCartaTopo();

    System.out.printf(" A carta retirada do topo foi %s de %s\n",
    carta3.getNaipe(), carta3.getNome());
    System.out.printf(" A carta retirada do topo foi %s de %s\n",
    carta4.getNaipe(), carta4.getNome());
    System.out.printf(" A carta retirada do topo foi %s de %s\n",
    carta5.getNaipe(), carta5.getNome());

    System.out.println("\nImprimindo o baralho após retirar carta: ");
    baralho.imprimiBaralho();


    System.out.println("\nImprimindo o baralho após devolver uma carta: ");
    baralho.daCarta(carta3);
    baralho.imprimiBaralho();


    System.out.println("\nEmabaralhando o baralho após devolver uma carta: ");
    baralho.embaralha();
    baralho.imprimiBaralho();

    System.out.println("\nImprimindo o baralho após devolver uma carta: ");
    baralho.daCarta(carta5);
    baralho.imprimiBaralho();


  }
}
