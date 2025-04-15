package solutis.elasticcode.conjuntoquatro;

import java.util.Scanner;

public class Exercicio63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("qual o tamanho da pirâmide?");
        int qtdLinhas = sc.nextInt();

        for (int i = 1; i <= qtdLinhas; i++) {
            StringBuilder linha = new StringBuilder("");
            for (int j = i; j > 0; j--) {
                if (j < 10) {
                    linha = linha.insert(0, "0"+j);
                } else {
                    linha = linha.insert(0, j);
                }
            }
            System.out.println(linha);
        }
    }
}
