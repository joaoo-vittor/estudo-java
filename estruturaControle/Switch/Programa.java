<<<<<<< HEAD
package estruturaControle.Switch;
=======
package Switch;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

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
