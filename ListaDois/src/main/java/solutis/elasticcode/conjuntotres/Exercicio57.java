package solutis.elasticcode.conjuntotres;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha uma data de início: (xx/xx/xxxx)");
        String dataInicio = sc.nextLine();
        int dia1 = Integer.parseInt(dataInicio.substring(0,2));
        int mes1 = Integer.parseInt(dataInicio.substring(3,5));
        int ano1 = Integer.parseInt(dataInicio.substring(7,10));
        System.out.println("Escolha uma data de fim: (xx/xx/xxxx)");
        String dataFim = sc.nextLine();
        int dia2 = Integer.parseInt(dataFim.substring(0,2));
        int mes2 = Integer.parseInt(dataFim.substring(3,5));
        int ano2 = Integer.parseInt(dataFim.substring(7,10));

        LocalDate data1 = LocalDate.of(ano1, mes1, dia1);
        LocalDate data2 = LocalDate.of(ano2, mes2, dia2);

        while(data1.isBefore(data2)) {
            System.out.println(data1);
            data1 = data1.plusDays(1);
        }
    }
}
