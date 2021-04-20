package PadraoObserver;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

  private List<ObservadorChegadaAniversariante> observadores = 
          new ArrayList<>();
  
  public void registrarObservadores(ObservadorChegadaAniversariante observador) {
    observadores.add(observador);
  }

  public void monitorar() {
    Scanner entrada = new Scanner(System.in);
    String valor = "";

    while (!"sair".equalsIgnoreCase(valor)) {
      System.out.println("Aniversariante chegou? ");
      valor = entrada.nextLine();

      if("sim".equalsIgnoreCase(valor)) {
        // criar evento
        Calendar data = Calendar.getInstance();
        EventoChegadaAniversariante evento = 
        new EventoChegadaAniversariante(data);
        
        // notificar os observadores
        observadores.stream().forEach(o -> o.chegou(evento));
        valor = "sair";
      } else {
        System.out.println("Alarme falso!");
      }
    }

    entrada.close();
  }
}
