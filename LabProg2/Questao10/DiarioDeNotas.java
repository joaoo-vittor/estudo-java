package LabProg2.Questao10;

/**
 * Classe que simula um diário de notas.
 * Versão: 0.01
 * Autor: Turma de Prog. 2
 *
*/

public class DiarioDeNotas {

  private byte nota;
  private boolean aprovado;
  private String instrutor;
  private String nomeCurso;

  public DiarioDeNotas(byte nota){
    this.nota = nota;
} // Construtor que recebe nota

  public DiarioDeNotas(String nomeCurso, String instrutor){
      this.nomeCurso = nomeCurso;
      this.instrutor = instrutor;
  }

  public String exibirMensagem() {
    String inicioMsg = "Bem-Vindo ao curso " + this.nomeCurso;
    String fimMsg = "Esse curso é apresentado por " + this.instrutor;
    return inicioMsg + "\n" + fimMsg;
  }

  public DiarioDeNotas(){
  } // Fim do construtor vazio

  //public DiarioDeNotas(int nota, float media){}

  public void setNota(byte nota){
      this.nota = nota;
  } // Fim do método setNota

  public byte getNota(){
      return this.nota;
  } // Fim do método getNota

  public boolean isAprovado() {
      return aprovado;
  }

  public void setAprovado(boolean aprovado) {
      this.aprovado = aprovado;
  }

  public String getInstrutor() {
    return instrutor;
  }

  public void setInstrutor(String instrutor) {
    this.instrutor = instrutor;
  }

} // Fim da classe DiarioDeNotas
