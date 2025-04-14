package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira suas 4 notas:");
        double media = 0.0;

        for (int i = 1; i <= 3; i++) {
            System.out.println("Nota " + i + ":");
            media += sc.nextInt();
        }

        double mediaFinal = media / 3;

        System.out.println("Sua média final foi: " + (mediaFinal));
        if (mediaFinal >= 7) {
            System.out.println("Parabéns, você foi aprovado!");
        } else if (mediaFinal < 5) {
            System.out.println("Infelizmente você foi reprovado.");
        } else {
            System.out.println("Você deverá fazer a recuperação.");

        }

    }
}
