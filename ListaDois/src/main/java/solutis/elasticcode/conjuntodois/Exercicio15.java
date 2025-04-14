package solutis.elasticcode.conjuntodois;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio15 {

    public boolean dataValida(int ano, int mes, int dia) {
        try {
            LocalDate.of(ano, mes, dia);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }

    public String nomeMes(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AniversarioValido validar = new AniversarioValido();

        System.out.println("Digite o dia do seu aniversário: ");
        int dia = sc.nextInt();

        System.out.println("Digite o mes do seu aniversário: ");
        int mes = sc.nextInt();

        System.out.println("Digite seu ano de nascimento:");
        int ano = sc.nextInt();

        if ((mes > 0 && mes < 13) || (dia > 0 && dia < 32)) {

            if (validar.dataValida(ano, mes, dia)) {
                System.out.println("A data " + dia + " de " + validar.nomeMes(mes) + " é uma data válida");
            } else {
                System.out.println("Data inválida");
            }

        } else {
            System.out.println("Data inválida");
        }

    }
}
