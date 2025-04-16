package solutis.elasticcode.conjuntotres;

import java.util.Random;
import java.util.Scanner;

public class Exercicio56 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            String[] candidatos = new String[3];
            int[] votos = new int[4];
            int somavotos = 0;
            int maiorvotos = 9999;
            int vencedor = 0;

            System.out.println("Digite o nome de 3 candidatos!");

            for (int i = 1; i <= 3; i++) {
                System.out.printf("%dº: ", i);
                candidatos[i - 1] = scanner.nextLine();
                votos[i - 1] = random.nextInt(1001);

                if (votos[i - 1] > maiorvotos) {
                    maiorvotos = votos[i - 1];
                }

                somavotos += votos[i - 1];
            }

            votos[3] = random.nextInt(1001);
            somavotos += votos[3];

            for (int i = 1; i <= 3; i++) {
            System.out.printf("O candidato %s teve %d%% dos votos com %d votos%n", candidatos[i - 1], (votos[i - 1] / somavotos) * 100, votos[i - 1]);
            }

            System.out.printf("%d%% dos votos foram nulos/em branco. (especificamente %d votos)%n", (votos[3] / somavotos) * 100, votos[3]);

            for (int i = 0; i < 3; i++) {
                if (maiorvotos == votos[i]) vencedor = i;
            }

            System.out.printf("O candidato vencedor é %s!", candidatos[vencedor]);
        }
}
