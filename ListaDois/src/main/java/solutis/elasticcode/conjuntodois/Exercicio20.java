package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] pessoas = {"Pessoa1", "Pessoa2"};
        int[] idades = {0, 0};

        for (int i = 1; i <= 2; i++) {
            System.out.printf("Digite o nome da pessoa %d: ", i);
            pessoas[i - 1] = scanner.nextLine();

            System.out.printf("Digite a idade da pessoa %d: ", i);
            idades[i - 1] = scanner.nextInt();
            scanner.nextLine();
        }

        if (idades[0] > idades[1]) {
            System.out.printf("%s é a pessoa mais velha.", pessoas[0]);
        } else if (idades[0] < idades[1]) {
            System.out.printf("%s é a pessoa mais velha.", pessoas[1]);
        } else {
            System.out.println("Ambas as pessoas tem a mesma idade!");
        }
    }
}
