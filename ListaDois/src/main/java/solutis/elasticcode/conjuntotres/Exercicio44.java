package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha quantos valores serão digitados");
        int qtdValores = sc.nextInt();
        int total = 0;

        for (int i = 0 ; i < qtdValores ; i++) {
            System.out.println("Digite um valor:");
            total += sc.nextInt();
        }
        double media = (double) total / qtdValores;

        System.out.println("A média dos valores digitados foi " +media);
    }
}
