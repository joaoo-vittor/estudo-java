<<<<<<< HEAD
package StreamAPI.OutrosMetodos;
=======
package OutrosMetodos;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Arrays;
import java.util.List;

public class Outros {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Ana", 7.1);
    Aluno a2 = new Aluno("Maria", 6.1);
    Aluno a3 = new Aluno("Joao", 8.1);
    Aluno a4 = new Aluno("Sophia", 10);
    Aluno a5 = new Aluno("Jose", 7.1);
    Aluno a6 = new Aluno("Marcos", 6.1);
    Aluno a7 = new Aluno("Joanderson", 8.1);
    Aluno a8 = new Aluno("Rodrigo", 10);
    Aluno a9 = new Aluno("Joanderson", 8.1);
    Aluno a10 = new Aluno("Rodrigo", 10);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10);

    System.out.println("distinct...");
    alunos.stream().distinct().forEach(System.out::println);

    System.out.println("\nSkip/Limit...");
    alunos.stream()
          .distinct()
          .skip(2) // salto
          .limit(2) // limite
          .forEach(System.out::println);


    System.out.println("\ntakeWhile...");
    alunos.stream()
          .distinct()
          .takeWhile(a -> a.nota >= 7) // pegue enquanto
          .forEach(System.out::println);

  }
}
