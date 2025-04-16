package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de notas para o cálculo da média: ");
        int qtdN = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a quantidade de aulas: ");
        int qtdA = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Digite a quantidade das suas faltas: ");
        int qtdF = scanner.nextInt();
        scanner.nextLine();

        if (qtdA / 4 < qtdF) {
            System.out.println("Você está reprovado por falta.");
            System.exit(0);
        }

        double[] notas = new double[qtdN];

        for (int i = 1; i <= qtdN; i++) {
            System.out.printf("Digite a sua %dª nota: ", i);

            notas[i - 1] = scanner.nextInt();
            scanner.nextLine();
        }

        double somaNotas = 0;
        int media = 7;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i];
        }

        if (somaNotas / qtdN < media) {
            System.out.println("Você está reprovado por notas.");
        } else {
            System.out.println("Você passou!");
        }
    }
}
