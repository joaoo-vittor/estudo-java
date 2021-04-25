public class MainQuestao3 {
  public static void main(String[] args) {

    Baralho baralho = new Baralho();
    System.out.println("\nImprimindo o baralho: ");
    baralho.imprimiBaralho();

    System.out.println("\nEmabaralhando o baralho: ");
    baralho.embaralha();
    baralho.imprimiBaralho();

    System.out.println("\nBuscando carta no Baralho: ");
    Carta carta1 = new Carta("REI", "COPAS");
    Carta carta2 = new Carta("9", "ESPADA");
    Carta carta6 = new Carta("blabla", "bla");

    System.out.printf(" A carta %s de %s foi encontrada: %s \n",
    carta1.getNome(), carta1.getNaipe(), baralho.temCarta(carta1));
    System.out.printf(" A carta %s de %s foi encontrada: %s \n",
    carta2.getNome(), carta2.getNaipe(), baralho.temCarta(carta2));
    System.out.printf(" A carta %s de %s foi encontrada: %s \n",
    carta6.getNome(), carta6.getNaipe(), baralho.temCarta(carta6));

    System.out.println("\nRetirando cartas do topo baralho: ");

    Carta carta3 = baralho.tirarCartaTopo();
    Carta carta4 = baralho.tirarCartaTopo();
    baralho.embaralha();
    Carta carta5 = baralho.tirarCartaTopo();

    System.out.printf(" A carta retirada do topo foi %s de %s\n",
    carta3.getNome(), carta3.getNaipe());
    System.out.printf(" A carta retirada do topo foi %s de %s\n",
    carta4.getNome(), carta4.getNaipe());
    System.out.printf(" A carta retirada do topo foi %s de %s\n",
    carta5.getNome(), carta5.getNaipe());

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
