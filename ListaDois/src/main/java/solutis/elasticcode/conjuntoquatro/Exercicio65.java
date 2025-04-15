package solutis.elasticcode.conjuntoquatro;

import java.util.Scanner;

public class Exercicio65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o tamanho da pirâmide?");
        int qtdLinhas = sc.nextInt();

        for (int i = 1; i <= qtdLinhas; i++) {
            StringBuilder linha = new StringBuilder();

            for (int j = 0; j < qtdLinhas - i; j++) {
                linha.insert(0, " ");
            }

            for (int j = 0; j < 2 * i - 1; j++) {
                linha.append("*");
            }

            System.out.println(linha);
        }
    }
}
