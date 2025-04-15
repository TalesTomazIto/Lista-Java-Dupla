package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Determine uma quantidade de pessoas: ");
        int qtd = s.nextInt();

        int[] idades = new int[qtd];

        System.out.printf("Agora digite a idade de todas as %d pessoas!%n", qtd);
        for (int i = 0; i < qtd; i++) {
            System.out.printf("%dª pessoa: ", i + 1);
            idades[i] = s.nextInt();
            s.nextLine();
        }

        int soma = 0;
        int maior = 0;
        int menor = 999999999;
        int maioridade = 0;

        for (int i = 0; i < idades.length; i++) {
            soma += idades[i];

            if (idades[i] > maior) {
                maior = idades[i];
            } else if (idades[i] < menor) {
                menor = idades[i];
            }

            if (idades[i] >= 18) {
                maioridade++;
            }
        }

        int media = soma / qtd;

        System.out.printf("A média das idades é de %d, a maior idade é %d, a menor idade é %d e a quantidade de pessoas maior de idade é de %d", media, maior, menor, maioridade);
    }
}
