package solutis.elasticcode.conjuntotres;

import java.math.BigInteger;
import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos termos de tribonnacci?");
        int qtdTermos = sc.nextInt();
        BigInteger n1 = BigInteger.ONE;
        BigInteger n2 = BigInteger.ONE;
        BigInteger n3 = BigInteger.TWO;
        BigInteger n4;

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        for (int i = 3; i < qtdTermos; i++) {
            n4 = n1.add(n2).add(n3);
            System.out.println(n4);
            n1 = n2;
            n2 = n3;
            n3 = n4;
        }
    }
}
