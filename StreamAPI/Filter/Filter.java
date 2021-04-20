package StreamAPI.Filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {
  public static void main(String[] args) {

    Aluno a1 = new Aluno("Joao", 7.5);
    Aluno a2 = new Aluno("Jose", 4.5);
    Aluno a3 = new Aluno("Daniel", 8.0);
    Aluno a4 = new Aluno("Gui", 9.45);
    Aluno a5 = new Aluno("Pedro", 6.45);
    Aluno a6 = new Aluno("Sophia", 8.87);
    Aluno a7 = new Aluno("Bia", 5.59);

    List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7);

    Function<Aluno, String> msgAprovados =
            a -> "Parabens "+ a.nome +", voce foi aprovado!!!";

    Predicate<Aluno> aprovado = a -> a.nota >= 7;

    alunos.stream()
          .filter(aprovado)
          .map(msgAprovados)
          .forEach(System.out::println);


  }
}
