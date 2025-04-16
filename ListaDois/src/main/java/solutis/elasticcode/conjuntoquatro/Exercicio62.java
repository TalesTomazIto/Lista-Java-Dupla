package solutis.elasticcode.conjuntoquatro;

import java.util.Scanner;

public class Exercicio62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas: ");
        int qtd = scanner.nextInt();

        for (int i = 1; i <= qtd; i++) {
            StringBuilder linha = new StringBuilder("");
            for (int j = 1; j <= i; j++) {
                if (i < 10) {
                    linha = linha.insert(0, "0" + i + " ");
                } else {
                    linha = linha.insert(0, i + " ");
                }
            }
            System.out.println(linha);
        }
    }
}
