package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 0 ; i < 500 ; i++) {
            total += sc.nextInt();
        }
        double media = (double) total / 500;

        System.out.println("A média dos valores digitados foi " +media);
    }
}
