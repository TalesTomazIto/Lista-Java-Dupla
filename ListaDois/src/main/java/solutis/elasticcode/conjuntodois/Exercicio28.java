package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] lista = {0, 0, 0};

        System.out.println("Digite 3 números quaisquer.");

        for (int i = 0; i <= 2; i++) {
            System.out.printf("%dº: ", i + 1);

            lista[i] = s.nextInt();
        }

        int menor = 999999999;
        int maior = 0;
        int medio = 0;

        for (int i = 0; i <= 2; i++) {
            if (lista[i] < menor) {
                menor = lista[i];
            } else if (lista[i] > maior) {
                maior = lista[i];
            }
        }

        for (int i = 0; i <= 2; i++) {
            if (lista[i] == menor) {
                menor = lista[i];
            } else if (lista[i] == maior) {
                maior = lista[i];
            } else {
                medio = lista[i];
            }
        }

        System.out.printf("%d %d %d", menor, medio, maior);
    }
}
