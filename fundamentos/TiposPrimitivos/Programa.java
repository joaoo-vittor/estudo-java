package TiposPrimitivos;
/*
Tipos Primitivos
=> Numeros
  Inteiros:
  -> Byte
  -> Short
  -> Int
  -> Long
  
  Real:
  -> Double
  -> Float

=> Outros
  -> Char
  -> Boolean
*/
public class Programa {
  public static void main(String[] args) {
    // Tipos numericos inteiros
    byte anosDeEmpresa = 23;
    short numerosDeVoos = 542;
    int id = 56789;
    long pontosAcumulados = 3_134_845_223L;

    // Tipos numericos Reais
    float salario = 11_445.44F;
    double vendasAcumuladas = 2_991_797_333.01;

    // Tipos Booleans 
    boolean estaDeFerias = false;

    // Tipo caractere
    char status = 'A';

    // Dias de empresa 
    System.out.println(anosDeEmpresa * 365);

    // Numeros de viagem 
    System.out.println(numerosDeVoos / 2);

    // Pontos por real 
    System.out.println(pontosAcumulados / vendasAcumuladas);

    System.out.println(id + ": ganha -> " + salario);
    System.out.println("Ferias? " + estaDeFerias);
    System.out.println("Status: "+ status);
  }
}
