package solutis.elasticcode.conjuntotres;

import java.math.BigInteger;

public class Exercicio52 {
    public static void main(String[] args) {
        int casas = 64;
        BigInteger totalGraos = BigInteger.ZERO;

        for (int i = 0; i < casas; i++) {
            totalGraos = totalGraos.add(BigInteger.TWO.pow(i));
        }

        System.out.printf("Total de grãos de arroz: %d%n", totalGraos);

        BigInteger graosPorSaco = BigInteger.valueOf(1_000_000);
        BigInteger sacos = totalGraos.divide(graosPorSaco);

        System.out.printf("O total de sacos de arroz é de %d sacos (considerando que cada saco contém um milhão de grãos).", sacos);
    }
}
