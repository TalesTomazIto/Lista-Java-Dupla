package solutis.elasticcode.conjuntodois;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite uma data: ");
            String dataRecebida = scanner.nextLine();

            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(dataRecebida, df);

            boolean valido = true;
            int dia = date.getDayOfMonth();
            int mes = date.getMonthValue();
            int ano = date.getYear();
            int diasNoMes = 0;

            if (mes < 1 || mes > 12) {
                valido = false;
            } else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    diasNoMes = 30;
                } else if (mes == 2) {
                    if (((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0))) {
                        diasNoMes = 29;
                    } else {
                        diasNoMes = 28;
                    }
                } else {
                    diasNoMes = 31;
                }
            }

            if (dia < 1 || dia > diasNoMes) valido = false;

            if (valido) {
                System.out.println("A data é válida.");
            } else {
                System.out.println("A data é inválida");
            }
        } catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}