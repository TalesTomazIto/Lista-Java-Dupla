package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome de um mês: ");
        String mes = sc.nextLine().toLowerCase();

        switch (mes){
            case "janeiro":
                System.out.println(1);
                break;
            case "fevereiro":
                System.out.println(2);
                break;
            case "março":
                System.out.println(3);
                break;
            case "abril":
                System.out.println(4);
                break;
            case "maio":
                System.out.println(5);
                break;
            case "junho":
                System.out.println(6);
                break;
            case "julho":
                System.out.println(7);
                break;
            case "agosto":
                System.out.println(8);
                break;
            case "setembro":
                System.out.println(9);
                break;
            case "outubro":
                System.out.println(10);
                break;
            case "novembro":
                System.out.println(11);
                break;
            case "dezembro":
                System.out.println(12);
                break;
        }

    }
}
