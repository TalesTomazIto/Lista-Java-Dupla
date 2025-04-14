package solutis.elasticcode.conjuntotres;

import java.util.Random;
import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int aleatorio = random.nextInt(101);
        int escolha = -1;
        int tentativas = 0;

        while (aleatorio != escolha) {
            System.out.println("Escolha um número");
            tentativas++;
            escolha = sc.nextInt();
            if (escolha == aleatorio) {
                System.out.println("Você acertou, o número escolhido foi " + escolha);
                System.out.println("Foram " + tentativas + " tentativas");
            }
        }

    }
}
