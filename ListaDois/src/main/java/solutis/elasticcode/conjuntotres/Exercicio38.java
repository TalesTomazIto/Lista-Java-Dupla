package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = s.nextInt();

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.printf("O número %d não é primo!", num);
                System.exit(0);
            }
        }

        System.out.printf("O número %d é primo!", num);
    }
}
