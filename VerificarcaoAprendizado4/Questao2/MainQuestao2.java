package Questao2;

public class MainQuestao2 {
  public static void main(String[] args) {

    Passageiro[] passageiros = new Passageiro[6];

    String[] escola = {"Escola A", "Escola B", "Escola C"};
    double[] valorP = {20.5, 30.8, 60.6, 40.6, 10.0, 88.6};
    String[] poltrona = {"A-2", "B-2", "C-3", "D-2", "E-6", "B-1"};
    int[] idade = {16, 18, 22, 68, 87, 61};

    for (int i = 0; i < passageiros.length; i++) {
      if (i < 3) {
        passageiros[i] = new Estudante(escola[i], valorP[i], poltrona[i], idade[i]);
      } else {
        passageiros[i] = new Idoso(valorP[i], poltrona[i], idade[i]);
      }
    }

    for (Passageiro p : passageiros) {
      System.out.println("\n"+ p.toString() +"\n");
    }

  }
}
