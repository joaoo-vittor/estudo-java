package arraysEcollections.Collectionss;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
  public static void main(String[] args) {

    Deque<String> livros = new ArrayDeque<String>();

    livros.add("O pequeno principe");
    livros.push("Don Quixote");
    livros.push("O Hobbit");

    System.out.println(livros.peek());
    System.out.println(livros.element());

    for (String livro: livros) {
      System.out.println(livro);
    }

    System.out.println(livros.pop());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
    System.out.println(livros.poll());
    // System.out.println(livros.pop()); // Retorna uma exceção

    // livros.size();
    // livros.clear();
    // livros.isEmpty();
    // livros.contains(...);

  }
}
