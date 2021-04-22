import java.util.Random;

public class Baralho {

  private Carta[] baralho;
  private String nipes[] = {"COPAS", "PAUS", "ESPADA", "OURO"};
  private String nomeCarta[] = {"A", "2", "3", "4", "5", "6", "7", "8", "9",
                                "10", "VALETE", "DAMA", "REI"};
  Random gerador = new Random();

  public Baralho() {
    int index = 0;
    this.baralho = new Carta[56];
    for (int i = 0; i < this.nipes.length; i++) {
      for (int j = 0; j < this.nomeCarta.length; j++) {
        this.baralho[index] = new Carta(nipes[i], nomeCarta[j]);
        index++;
      }
      this.baralho[index] = new Carta("CORINGA", "CORINGA");
      index++;
    }
  }

  public void embaralha() {
    int posisao1;
    int posisao2;
    Carta auxCarta;

    for (int i = 0; i < 100; i++) {
      posisao1 = gerador.nextInt(56);
      posisao2 = gerador.nextInt(56);

      auxCarta = this.baralho[posisao1];
      this.baralho[posisao1] = this.baralho[posisao2];
      this.baralho[posisao2] = auxCarta;
    }
  }

  public void imprimiBaralho() {
    for (Carta c: this.baralho) {
      if (c != null) {
        System.out.println(c.getNome()+" - "+c.getNaipe());
      } else {
        System.out.println("VAZIO - VAZIO");
      }
    }
  }

  public boolean temCarta(Carta carta) {
    for (int i = 0, j = 55; i < 28; i++, j--) {
      if (this.baralho[i].equals(carta) || this.baralho[j].equals(carta)) {
        return true;
      }
    }
    return false;
  }

  public Carta getCarta(int index) {
    if (index >= 0 || index < 56) {
      return baralho[index];
    }
    return baralho[0];
  }

  public Carta tirarCartaTopo() {
    Carta auxCarta = null;
    boolean aux = true;
    int i = this.baralho.length-1;

    while (aux) {
      if (!(this.baralho[i] == null)) {
        auxCarta = this.getCarta(i);
        baralho[i] = null;
        aux = false;
      }
      i--;
    }

    return auxCarta;
  }

  public void daCarta(Carta carta) {
    for (int i = 0; i < this.baralho.length; i++) {
      if (this.baralho[i] == null) {
        baralho[i] = carta;
        return;
      }
    }
  }

}
