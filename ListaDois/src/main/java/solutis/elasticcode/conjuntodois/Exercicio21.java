package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu cargo (Diretor, Gerente, Operador):");
        String cargo = sc.nextLine().toLowerCase();
        System.out.println("Qual o valor do emprestimo?");
        Double emprestimo = sc.nextDouble();
        System.out.println("Qual o valor do seu salário?");
        Double salario = sc.nextDouble();

        if (cargo.equals("diretor")) {
            if (emprestimo <= (salario * 0.3)) {
                System.out.println("Você pode realizar o empréstimo");
            } else {
                System.out.println("Você não pode realizar o empréstimo");
            }
        }
        if (cargo.equals("gerente")) {
            if (emprestimo <= (salario * 0.25)) {
                System.out.println("Você pode realizar o empréstimo");
            } else {
                System.out.println("Você não pode realizar o empréstimo");
            }
        }
        if (cargo.equals("operador")) {
            if (emprestimo <= (salario * 0.2)) {
                System.out.println("Você pode realizar o empréstimo");
            } else {
                System.out.println("Você não pode realizar o empréstimo");
            }
        }
    }
}
