<<<<<<< HEAD
package StreamAPI.MinEMax;
=======
package MinEMax;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinAndMax {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana", 7.1);
    Aluno a2 = new Aluno("Maria", 6.1);
    Aluno a3 = new Aluno("Joao", 8.1);
    Aluno a4 = new Aluno("Sophia", 10);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

    Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
      if (aluno1.nota > aluno2.nota) return 1;
      if (aluno1.nota < aluno2.nota) return -1;
      return 0;
    };

    System.out.println(alunos.stream().max(melhorNota).get());
    System.out.println(alunos.stream().min(melhorNota).get());

  }
}
