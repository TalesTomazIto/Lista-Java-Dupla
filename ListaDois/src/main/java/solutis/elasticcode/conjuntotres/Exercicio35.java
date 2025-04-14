package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos números a serem sorteados?");
        int qtdSorteios = sc.nextInt();

        System.out.println("Qual o valor do menor valor possível?");
        int menor = sc.nextInt();
        System.out.println("Qual o valor do maior valor possível?");
        int maior = sc.nextInt();

        int intervalo = (maior - menor) + 1;

        for (int i = 0; i < qtdSorteios; i++) {
            System.out.println((int) (Math.random() * intervalo) + menor);
        }
    }
}
