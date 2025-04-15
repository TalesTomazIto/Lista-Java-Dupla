package solutis.elasticcode.conjuntoquatro;

import java.util.Scanner;

public class Exercicio61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o tamanho da pirâmide?");
        int qtdLinhas = sc.nextInt();

        for (int i = 1; i <= qtdLinhas; i++) {
            StringBuilder linha = new StringBuilder("");
            for (int j = 1; j <= i; j++) {
                linha = linha.insert(0, "*");
            }
            System.out.println(linha);
        }
    }
}
