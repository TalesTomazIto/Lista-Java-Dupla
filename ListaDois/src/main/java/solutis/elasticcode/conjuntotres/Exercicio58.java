package solutis.elasticcode.conjuntotres;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercicio58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite uma data: ");
            String dataRecebida = scanner.nextLine();

            DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(dataRecebida, df);

            System.out.print("Digite um número de dias: ");
            int dias = scanner.nextInt();
            scanner.nextLine();

            date = date.plusDays(dias);

            System.out.println(date.format(df));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
