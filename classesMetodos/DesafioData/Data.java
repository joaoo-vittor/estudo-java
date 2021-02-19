package DesafioData;

public class Data {
  
  int dia;
  int mes;
  int ano;

  // String dataFormatada() {
  //   return dia + "/" + mes + "/" + ano;
  // }

  Data(int diaInicial, int mesInicial, int anoInicial) {
    dia = diaInicial;
    mes = mesInicial;
    ano = anoInicial;
  }
  
  Data() {
    dia = 1;
    mes = 1;
    ano = 1970;
  }

  String dataFormatada() {
    return String.format("%d/%d/%d", dia, mes, ano);
  }

}
