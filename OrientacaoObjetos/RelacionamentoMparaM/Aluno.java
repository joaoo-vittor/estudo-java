package OrientacaoObjetos.RelacionamentoMparaM;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

  final String nome;

  /*
        +----------+
        |  Cursos  |
  final +----------+
        | 0x123456 | -> Endereço de memoria da lista sempre
        +----------+    ira apontar para o mesmo objeto;

  OBS: O conteudo pode variar,
       só não pode instânciar umas nova lista

  */
  final List<Curso> cursos = new ArrayList<Curso>();

  Aluno(String nome) {
    this.nome = nome;
  }

  void adicionarCurso(Curso curso) {
    this.cursos.add(curso);
    curso.alunos.add(this);
  }

  Curso obterCursoPorNome(String nome) {
    for (Curso curso: this.cursos) {
      if (curso.nome.equalsIgnoreCase(nome)) {
        return curso;
      }
    }

    return null;
  }

  public String toString() {
    return nome;
  }

}
