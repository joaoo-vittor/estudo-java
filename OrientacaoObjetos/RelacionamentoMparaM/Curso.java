<<<<<<< HEAD
package OrientacaoObjetos.RelacionamentoMparaM;
=======
package RelacionamentoMparaM;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.ArrayList;
import java.util.List;

public class Curso {

  final String nome;
  final List<Aluno> alunos = new ArrayList<Aluno>();

  Curso(String nome) {
    this.nome = nome;
  }

  void adicionarAluno(Aluno aluno) {
    this.alunos.add(aluno);
    aluno.cursos.add(this);
  }

}
