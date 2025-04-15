package solutis.elasticcode.conjuntodois;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um horário: ");
            String hrRecebida1 = scanner.nextLine();

            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            Date hora1 = df.parse(hrRecebida1);

            System.out.print("Digite um 2º horário: ");
            String hrRecebida2 = scanner.nextLine();

            Date hora2 = df.parse(hrRecebida2);

            int horaS1 = ((hora1.getHours() * 3600) + (hora1.getMinutes() * 60)) + hora1.getSeconds();
            int horaS2 = ((hora2.getHours() * 3600) + (hora2.getMinutes() * 60)) + hora2.getSeconds();

            System.out.printf("A diferença em segundos entre as horas é de %d", horaS1 - horaS2);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
