package solutis.elasticcode.conjuntoquatro;

import java.util.Scanner;

public class Exercicio64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de pirâmides: ");
        int qtdLinhas = scanner.nextInt();

        for (int i = 0; i <= qtdLinhas; i++) {
            StringBuilder linha = new StringBuilder("");
            for (int j = 0; j <= i; j++) {
                linha = linha.insert(0, "*");
                System.out.println(linha);
            }
            System.out.printf("%n");
        }
    }
}
