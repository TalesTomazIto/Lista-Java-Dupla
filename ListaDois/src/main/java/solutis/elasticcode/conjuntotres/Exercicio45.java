package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite mais 100 numeros:");
        int maior = sc.nextInt();
        int atual = 0;

        for (int i = 99; i > 0 ; i--) {
            System.out.println("Digite mais " + i + " numeros");
            atual = sc.nextInt();
            if (atual > maior) {
                maior = atual;
            }
        }
        System.out.println("O maior numero digitado foi: " + maior);
    }
}
