<<<<<<< HEAD
package LabProg2.Questao10;
=======
package Questao10;
>>>>>>> de63cc0128d8eb20c858b9c57f816095a08a85ce

import java.util.Scanner;

public class DiarioTeste{
    public static void main(String args[]){

        Scanner entrada;
        byte nota;

        System.out.println("Bem-vindos turma de prog. 2!!!");
        System.out.println("Digite a nota 1: ");
        entrada = new Scanner(System.in);
        nota = entrada.nextByte();

        DiarioDeNotas objeto1 = new DiarioDeNotas();
        System.out.println(objeto1.getNota());
        objeto1.setNota(nota);
        System.out.println(objeto1.getNota());

        DiarioDeNotas objeto2 = new DiarioDeNotas("Ciência da Computação", "Linus Torvalts");
        System.out.println(objeto2.exibirMensagem());
        objeto2.setInstrutor("Alan Turing");
        System.out.println(objeto2.exibirMensagem());

        entrada.close();
    } // Fim do main

} // Fim da classe DiarioDeTeste
