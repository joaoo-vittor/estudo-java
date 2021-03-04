package DesafioData;

public class Data {

  public int dia;
  int mes;
  int ano;

  // String dataFormatada() {
  //   return dia + "/" + mes + "/" + ano;
  // }

  public Data(int dia, int mes, int ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public Data() {
    // dia = 1;
    // mes = 1;
    // ano = 1970;
    this(1, 1, 1970);
  }

  public String dataFormatada() {
    String formato = "%d/%d/%d";
    return String.format(formato, this.dia, this.mes, this.ano);
  }

}
