package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe dois pontos em números.");

        System.out.print("Começo: ");
        int comeco = s.nextInt();

        System.out.print("Fim: ");
        int fim = s.nextInt();

        System.out.printf("Todos os números ímpares entre %d e %d são: ", comeco, fim);
        for (int i = comeco; i <= fim; i++) {
            if (i % 2 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
