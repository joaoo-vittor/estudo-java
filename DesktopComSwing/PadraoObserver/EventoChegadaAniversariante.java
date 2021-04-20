package PadraoObserver;

import java.util.Calendar;

public class EventoChegadaAniversariante {
  
  private final Calendar momento;

  public EventoChegadaAniversariante(Calendar momento) {
    this.momento = momento;
  }

  public Calendar getMomento() {
    return this.momento;
  }

}
