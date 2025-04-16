package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

class Fibonacci {
    public int sequence (int num) {
        return (num < 2) ? num : sequence(num - 1) + sequence(num + 2);
    }
}

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Fibonacci fibonacci = new Fibonacci();

        System.out.println("Digite um número: ");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.printf("O %dº termo da sequência de Fibonacci é: %d", num, fibonacci.sequence(num));
    }
}
