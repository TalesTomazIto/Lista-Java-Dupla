package solutis.elasticcode.conjuntotres;

import java.util.Scanner;

public class Exercicio55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Plano inicial
        double valorMensal = 50.00;
        int minutosGeral = 100;
        int minutosVaiVai = 50;
        double valorAPagar = 0.0;

        boolean continuar = true;

        while (continuar) {
            System.out.print("Digite o tipo de ligação ('o' = outras operadoras, 'v' = Vai-Vai, 'f' = fixo): ");
            char tipo = sc.nextLine().toLowerCase().charAt(0);

            System.out.print("Digite a quantidade de minutos: ");
            int minutos = sc.nextInt();

            switch (tipo) {
                case 'o':
                    if (minutos <= minutosGeral) {
                        minutosGeral -= minutos;
                    } else {
                        int excedente = minutos - minutosGeral;
                        valorAPagar += excedente * 0.65;
                        minutosGeral = 0;
                    }
                    break;

                case 'v':
                    if (minutos <= minutosVaiVai) {
                        minutosVaiVai -= minutos;
                    } else {
                        int restante = minutos - minutosVaiVai;
                        minutosVaiVai = 0;
                        if (restante <= minutosGeral) {
                            minutosGeral -= restante;
                        } else {
                            int excedente = restante - minutosGeral;
                            valorAPagar += excedente * 0.20;
                            minutosGeral = 0;
                        }
                    }
                    break;

                case 'f':
                    int consumo = (int) Math.ceil(minutos / 2.0);
                    if (consumo <= minutosGeral) {
                        minutosGeral -= consumo;
                    } else {
                        minutosGeral = 0;
                    }
                    break;

                default:
                    System.out.println("Tipo de ligação inválido.");
            }

            System.out.println("Minutos gerais restantes: " + minutosGeral);
            System.out.println("Minutos Vai-Vai restantes: " + minutosVaiVai);
            System.out.printf("Valor a pagar (além dos R$50,00): R$ %.2f%n", valorAPagar);

            System.out.print("Deseja inserir outra ligação? (s/n): ");
            char resposta = sc.nextLine().toLowerCase().charAt(0);
            if (resposta != 's') {
                continuar = false;
            }
        }

        double total = valorMensal + valorAPagar;
        System.out.printf("Total a pagar: R$ %.2f%n", total);
    }
}
