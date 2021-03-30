package PrimeiraFuncao;

// Só permite um método dentro da interface
@FunctionalInterface
public interface Calculo {

  public abstract double execultar(double a, double b);

}
