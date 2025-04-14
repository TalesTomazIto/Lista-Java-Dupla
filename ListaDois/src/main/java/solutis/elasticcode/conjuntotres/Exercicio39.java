package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um número:");
        int num = sc.nextInt();
        int soma = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                soma += i;
            }
        }

        if (soma == num) {
            System.out.println("O número escolhido é perfeito");
        } else {
            System.out.println("O número escolhido não é perfeito");
        }
    }
}
