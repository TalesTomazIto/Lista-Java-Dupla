package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um numero: ");
        int escolha = sc.nextInt();

        System.out.println("A tabuada deste número é: ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(escolha * i);
        }
    }
}
