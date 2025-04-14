package solutis.elasticcode.conjuntodois;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Exercicio17 {

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
        Exercicio17 validar = new Exercicio17();

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

        if (mes < 4) {
            System.out.println("Você faz aniversário no 1° Trimestre");
        } else if ( mes < 7) {
            System.out.println("Você faz aniversário no 2° Trimestre");
        } else if ( mes < 10) {
            System.out.println("Você faz aniversário no 3° Trimestre");
        } else {
            System.out.println("Você faz aniversário no 4° Trimestre");
        }

        if ((mes == 12 && dia > 21) || (mes == 1 && dia < 21)) {
            System.out.println("Seu signo é Capricórnio.");
        } else if (mes == 1 || (mes == 2 && dia < 19)) {
            System.out.println("Seu signo é Aquário.");
        } else if (mes == 2 || (mes == 3 && dia < 21)) {
            System.out.println("Seu signo é Peixes.");
        } else if (mes == 3 || (mes == 4 && dia < 21)) {
            System.out.println("Seu signo é Áries");
        } else if (mes == 4 || (mes == 5 && dia < 21)) {
            System.out.println("Seu signo é Touro");
        } else if (mes == 5 || (mes == 6 && dia < 21)) {
            System.out.println("Seu signo é Gêmeos");
        } else if (mes == 6 || (mes == 7 && dia < 23)) {
            System.out.println("Seu signo é Câncer");
        } else if (mes == 7 || (mes == 8 && dia < 23)) {
            System.out.println("Seu signo é Leão");
        } else if (mes == 8 || (mes == 9 && dia < 23)) {
            System.out.println("Seu signo é Virgem");
        } else if (mes == 9 || (mes == 10 && dia < 23)) {
            System.out.println("Seu signo é Libra");
        } else if (mes == 10 || (mes == 11 && dia < 22)) {
            System.out.println("Seu signo é Escorpião");
        } else {
            System.out.println("Seu signo é Sargitário");
        }

    }
}
