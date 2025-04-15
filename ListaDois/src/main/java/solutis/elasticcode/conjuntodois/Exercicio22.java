package solutis.elasticcode.conjuntodois;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite uma data: ");
            String dataRecebida1 = scanner.nextLine();

            DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
            Date data1 = df.parse(dataRecebida1);

            System.out.print("Digite uma 2ª data: ");
            String dataRecebida2 = scanner.nextLine();

            Date data2 = df.parse(dataRecebida2);

            int dia1 = data1.getDay();
            int mes1 = data1.getMonth();
            int dia2 = data2.getDay();
            int mes2 = data2.getMonth();

            if (dia1 == dia2 && mes1 == mes2) {
                System.out.println("As datas são iguais!");
            } else {
                System.out.println("As datas são distintas!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
