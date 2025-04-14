package solutis.elasticcode.conjuntodois;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome1 = sc.nextLine();
        System.out.println("Digite o mes de nascimento:");
        int mes1 = sc.nextInt();
        System.out.println("Digite o dia de nascimento:");
        int dia1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite seu nome:");
        String nome2 = sc.nextLine();
        System.out.println("Digite o mes de nascimento:");
        int mes2 = sc.nextInt();
        System.out.println("Digite o dia de nascimento:");
        int dia2 = sc.nextInt();

        if (LocalDate.of(LocalDate.now().getYear(), mes1, dia1).isBefore(
                LocalDate.of(LocalDate.now().getYear(), mes2, dia2)
        )) {
            System.out.println(nome1 + " faz aniversário primeiro.");
        } else {
            System.out.println(nome2 + " faz aniversário primeiro");
        }

    }
}
