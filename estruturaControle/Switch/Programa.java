package estruturaControle.Switch;

public class Programa {
  public static void main(String[] args) {
    
    String faixa = "preta";
    String nivel = "";
    
    switch (faixa.toLowerCase()) {
      case "preta":
        nivel = "Sei o Bassai-Dai...";
        break;
      case "marrom":
        nivel = "Sei o Tekki Shodan";
        break;
      case "roxa":
        nivel = "Sei o Heian Godan";
        break;
      case "verde":
        nivel = "Sei o Heian Yodan";
        break;
      default:
        nivel = "Não sei nada";
        break;
    }

    System.out.println(nivel);

  }
}
