package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número:");
        int numero1 = sc.nextInt();

        System.out.println("Digite um segundo número:");
        int numero2 = sc.nextInt();

        if (numero1 >= numero2){
            System.out.println("Essa é a ordem crescente dos números");

            System.out.println(numero2);
            System.out.println(numero1);
        } else {
            System.out.println("Essa é a ordem crescente dos números");

            System.out.println(numero1);
            System.out.println(numero2);
        }
    }
}
