package Collectionss;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
  public static void main(String[] args) {

    Queue<String> fila = new LinkedList<>();

    // Offer e Add -> adicionam elementos na fila
    // Diferença é o comportamento que ocorre
    // qundo a fila está cheia!
    fila.add("Ana"); // retorna false
    fila.offer("Maria"); // Lança um exceção
    fila.offer("João");
    fila.offer("Chandler");
    fila.offer("Joe");


    // Peek e Element -> Obtem o próximo elemento
    // da fila (SEM REMOVER)
    // Diferença é o comportamento que ocorre
    // quando a fila está vazia!
    System.out.println(fila.peek()); // retorna null
    System.out.println(fila.peek());
    System.out.println(fila.element()); // Lança uma exceção
    System.out.println(fila.element());


    // Poll e Remove -> Obtem o próximo elemento
    // da fila e REMOVE
    // Diferença é o comportamento que ocorre
    // quando a fila está vazia!
    System.out.println(fila.poll()); // retorna null
    System.out.println(fila.remove()); // Lança uma exceção
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.poll());
    System.out.println(fila.remove());

    // fila.size();
    // fila.clear();
    // fila.isEmpty();
    // fila.contains(...);


  }
}
