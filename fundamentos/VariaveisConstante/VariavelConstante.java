package fundamentos.VariaveisConstante;

public class VariavelConstante {
  public static void main(String[] args) {
    double raio = 3.4;
    // final -> torna o PI como uma constante
    final double PI = 3.14159;

    double area = PI * raio * raio;

    System.out.println("Area: " + area);
  }
}
