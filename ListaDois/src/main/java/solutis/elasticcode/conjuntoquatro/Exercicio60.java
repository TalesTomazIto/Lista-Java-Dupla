package solutis.elasticcode.conjuntoquatro;

import java.util.Scanner;

public class Exercicio60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double divida = scanner.nextDouble();

        System.out.print("Digite a taxa: ");
        double taxa = scanner.nextDouble();

        System.out.print("Digite a quantidade de anos: ");
        int anos = scanner.nextInt();

        double taxaPercentual = taxa / 100;
        double dividaAtual = divida;

        int meses = anos * 12;

        for (int i = 1; i <= meses; i++) {
            System.out.printf("%.2f%n", dividaAtual);

            dividaAtual += dividaAtual * taxaPercentual;
        }
    }
}
