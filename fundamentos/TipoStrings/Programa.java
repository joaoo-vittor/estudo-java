package fundamentos.TipoStrings;

public class Programa {
  public static void main(String[] args) {
    System.out.println("Olá mundo".charAt(2));

    String s = "Boa tarde";

    
    System.out.println(s.concat("!!!"));
    System.out.println(s.startsWith("Boa"));
    System.out.println(s.endsWith("tarde"));
    System.out.println(s.length());
    System.out.println(s.equals("boa tarde"));
    System.out.println(s.equalsIgnoreCase("boa tarde"));

    var nome = "joao";
    var sobrenome = "silva";
    var idade = 22;
    var salario = 13444.09;

    System.out.println("Nome: "+ nome + "\nSobrenome: "+ sobrenome 
    + "\nIdade: "+ idade + "\nSalario: "+ salario + "\n\n");

    System.out.printf("O senhor %s %s tem %d anos e ganha %.2f \n\n", 
      nome, sobrenome, idade, salario);

    String frase = String.format("O senhor %s %s tem %d anos e ganha %.2f ",
      nome, sobrenome, idade, salario);

    System.out.println(frase);

    System.out.println("Frase qualquer".contains("qual"));
    System.out.println("Frase qualquer".indexOf("qual"));
    System.out.println("Frase qualquer".substring(6));
    System.out.println("Frase qualquer".substring(6, 10));

  }
}
