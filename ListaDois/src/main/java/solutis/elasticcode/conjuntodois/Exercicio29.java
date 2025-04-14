package solutis.elasticcode.conjuntodois;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Integer[] ponto1 = new Integer[2];
        Integer[] ponto2 = new Integer[2];

        System.out.println("Digite a coordenada x de um ponto");
        ponto1[0] = sc.nextInt();
        System.out.println("Digite a coordenada y de um ponto");
        ponto1[1] = sc.nextInt();
        System.out.println("Digite a coordenada x de outro ponto");
        ponto2[0] = sc.nextInt();
        System.out.println("Digite a coordenada y de outro ponto");
        ponto2[1] = sc.nextInt();

        if (ponto1[0] == ponto2[0] && ponto1[1] == ponto2[1]) {
            System.out.println("Os pontos representam um único ponto");
        } else if (ponto1[0] == ponto2[0]) {
            System.out.println("Os pontos formam uma reta horizontal");
        }else if (ponto1[1] == ponto2[1]) {
            System.out.println("Os pontos formam uma reta vertical");
        } else {
            System.out.println("Os pontos forma um retângulo");
            double area = (ponto1[0] - ponto2[0]) * (ponto1[1] - ponto2[1]);
            if (area < 0) {
                area *= -1;
            }

            Integer[] ponto3 = new Integer[2];
            System.out.println("A área do retângulo é " + area);
            ponto3[0] = sc.nextInt();
            System.out.println("Digite o x de um terceiro ponto:");
            ponto3[1] = sc.nextInt();

            int xMin = Math.min(ponto1[0], ponto2[0]);
            int xMax = Math.max(ponto1[0], ponto2[0]);
            int yMin = Math.min(ponto1[1], ponto2[1]);
            int yMax = Math.max(ponto1[1], ponto2[1]);

            if (ponto3[0] < xMin) {
                if (ponto3[1] < yMin) {
                    System.out.println("O ponto está acima e à esquerda do retângulo.");
                } else if (ponto3[1] > yMax) {
                    System.out.println("O ponto está embaixo e à esquerda do retângulo.");
                } else {
                    System.out.println("O ponto está à esquerda do retângulo.");
                }
            } else if (ponto3[0] > xMax) {
                if (ponto3[1] < yMin) {
                    System.out.println("O ponto está acima e à direita do retângulo.");
                } else if (ponto3[1] > yMax) {
                    System.out.println("O ponto está embaixo e à direita do retângulo.");
                } else {
                    System.out.println("O ponto está à direita do retângulo.");
                }
            } else {
                if (ponto3[1] < yMin) {
                    System.out.println("O ponto está acima do retângulo.");
                } else if (ponto3[1] > yMax) {
                    System.out.println("O ponto está embaixo do retângulo.");
                } else if (ponto3[0] > xMin && ponto3[0] < xMax && ponto3[1] > yMin && ponto3[1] < yMax) {
                    System.out.println("O ponto está dentro do retângulo.");
                } else {
                    System.out.println("O ponto está na linha do retângulo.");
                }
            }
        }
    }
}
