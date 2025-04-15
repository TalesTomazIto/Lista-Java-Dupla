package solutis.elasticcode.conjuntotres;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha um número para ser calculado o fatorial: ");
        int valorInicial = sc.nextInt();

        BigInteger fatorial = BigInteger.valueOf(valorInicial);

        for (int i = 1; i < valorInicial; i++) {
            fatorial = fatorial.multiply(BigInteger.valueOf(i));
        }

        System.out.println("O fatorial de " + valorInicial + " é " + fatorial);
    }
}