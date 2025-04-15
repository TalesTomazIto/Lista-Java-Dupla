package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira seu salário bruto: ");
        float bruto = scanner.nextFloat();

        System.out.print("Insira qualquer desconto que possa ter: ");
        float desconto = scanner.nextFloat();

        float liquido = bruto - desconto;

        float max = (liquido / 100) * 30;

        System.out.print("Insira o valor que quer de empréstimo: ");
        float emp = scanner.nextFloat();

        if (emp <= max) {
            System.out.println("Você poderá fazer o empréstimo!");
        } else {
            System.out.println("Você não poderá fazer o empréstimo!");
        }
    }
}
