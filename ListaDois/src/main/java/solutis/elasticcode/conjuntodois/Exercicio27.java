package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num1 = sc.nextInt();

        System.out.println("Digite outro número:");
        int num2 = sc.nextInt();

        System.out.println("Digite mais um número:");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("O maior número é: "+ num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O maior número é: "+ num2);
        } else if (num3 > num2 && num3 > num1) {
            System.out.println("O maior número é: "+ num1);
        } else if (num1 == num2) {
            System.out.println("Os dois primeiros números são iguais");
        } else if (num1 == num3) {
            System.out.println("O primeiro e o ultimo número são iguais");
        } else {
            System.out.println("Os dois últimos números são iguais");
        }

    }
}
