package solutis.elasticcode.conjuntotres;

import java.math.BigInteger;

public class Exercicio49 {
    public static void main(String[] args) {
        BigInteger n1 = BigInteger.ONE;
        BigInteger n2 = BigInteger.ONE;
        BigInteger n3;

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 2; i < 50; i++) {
            n3 = n1.add(n2);
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
