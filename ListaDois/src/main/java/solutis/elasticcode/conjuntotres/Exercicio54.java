package solutis.elasticcode.conjuntotres;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio54 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o valor inicial em reais: ");
        double valorIni = scanner.nextDouble();

        System.out.print("Insira o valor final em reais: ");
        double valorFin = scanner.nextDouble();

        System.out.print("Insira o valor do encremento: ");
        double incremento = scanner.nextDouble();

        System.out.print("Informe o valor de um dólar em reais: ");
        double cotacao = scanner.nextDouble();

        DecimalFormat dfRs = new DecimalFormat("R$ #,##0.00");
        DecimalFormat dfUsd = new DecimalFormat("USD$ #,##0.00");

        System.out.println("=== Tabela de conversão ===");
        System.out.println("Reais\t\tDólares");

        for (double reais = valorIni; reais <= valorFin; reais += incremento) {
            double dolares = reais / cotacao;

            System.out.println(dfRs.format(reais) + "\t" + dfUsd.format(dolares));
        }
    }
}
