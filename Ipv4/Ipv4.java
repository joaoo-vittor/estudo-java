package Ipv4;

public class Ipv4 {

  private String ipv4;
  private int mascara;

  Ipv4(String ipv4, int mascara) {
    this.ipv4 = ipv4;
    this.mascara = mascara;
  }

  private String[] converteParaBinario() {
    String ip[] = this.ipv4.split("\\.");
    String listBinIp[] = new String[4];

    int j = 0;
    for (String i : ip) {
      int iNum = Integer.parseInt(i);
      String binNum = Integer.toBinaryString(iNum);
      String zeros = "";
      for (int k = 0; k < 8 - binNum.length(); k++) {
        zeros += "0";
      }
      binNum = zeros + binNum;
      listBinIp[j++] = binNum;
    }

    return listBinIp;
  }

  private String[] mascaraDeSubredeBinario() {
    String binMascara[] = new String[4];

    int cont = 0;
    for (int i = 0; i < 4; i++) {
      String parte = "";
      for (int j = 0; j < 8; j++) {
        if (cont < this.mascara) {
          parte += "1";
        } else {
          parte += "0";
        }
        cont++;
      }
      binMascara[i] = parte;
    }

    return binMascara;
  }

  private int[] numerosDeRedes() {
    String mascara[] = new String[4];
    mascara = this.mascaraDeSubredeBinario();
    int numZeros = 8 - mascara[3].indexOf("0");
    int hosts = (int) ((Math.pow(2, numZeros)) - 2);
    int retorno[] = {hosts, numZeros};
    return retorno;
  }

  private int[] mascaraDeSubrede() {
    String mascaraBinaria[] = new String[4];
    mascaraBinaria = this.mascaraDeSubredeBinario();
    int mascara[] = {0,0,0,0};

    int i = 0;
    for (String bin : mascaraBinaria) {
      int num;
      num = Integer.parseInt(bin, 2);
      mascara[i++] = num;
    }

    return mascara;
  }

  private int[] tiposIp(String tipo) {
    String ipBinario[] = new String[4];
    ipBinario = this.converteParaBinario();
    int numZeros = this.numerosDeRedes()[1];
    int ip[] = {0,0,0,0};

    String zeros = "";
    for (int i = 0; i < numZeros; i++) {
      if (tipo == "b") {
        zeros += "1";
      } else {
        zeros += "0";
      }
    }

    ipBinario[3] = ipBinario[3].substring(0, 8 - numZeros) + zeros;

    for (int i = 0; i < ipBinario.length; i++) {
      int num = Integer.parseInt(ipBinario[i], 2);
      ip[i] = num;
    }

    return ip;
  }

  public void informacaoDoIpv4() {
    String rede = trueJoin(this.tiposIp(""), ".");
    String broadcast = trueJoin(this.tiposIp("b"), ".");
    String mascara = trueJoin(this.mascaraDeSubrede(), ".");

    int auxArr[] = this.tiposIp("");
    auxArr[3] = auxArr[3] + 1;
    String primeiroIp = trueJoin(auxArr, ".");

    auxArr = this.tiposIp("b");
    auxArr[3] = auxArr[3] - 1;
    String ultimoIp = trueJoin(auxArr, ".");


    System.out.printf("Ip: %s/ %d\n", this.ipv4, this.mascara);
    System.out.printf("Rede: %s/ %d\n", rede, this.mascara);
    System.out.printf("Broadcast: %s/ %d\n", broadcast, this.mascara);
    System.out.printf("Máscara: %s\n", mascara);
    System.out.printf("Primeiro IP: %s/ %d\n", primeiroIp, this.mascara);
    System.out.printf("Ultimo IP: %s/ %d\n", ultimoIp, this.mascara);
    System.out.printf("Números de IP's: %d\n", this.numerosDeRedes()[0]);
  }

  public String trueJoin(int[] lista, String separador) {
    String retorno = "";

    for (int i = 0; i < lista.length; i++) {
      if (i < lista.length - 1) {
        retorno += lista[i] + separador;
      } else {
        retorno += lista[i];
      }
    }

    return retorno;
  }

}
