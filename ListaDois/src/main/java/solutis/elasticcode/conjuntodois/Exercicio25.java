package solutis.elasticcode.conjuntodois;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Scanner;

public class Exercicio25 {
    public boolean validar(int hora, int min, int seg) {
        try {
            LocalTime.of(hora, min, seg);
            return true;
        } catch (DateTimeException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicio25 horarioValido = new Exercicio25();

        System.out.println("Digite um horário: (xx:xx:xx)");
        String horario = sc.nextLine();
        int hora = Integer.parseInt(horario.substring(0, 2));
        int min = Integer.parseInt(horario.substring(3, 5));
        int seg = Integer.parseInt(horario.substring(6, 8));

        if (horarioValido.validar(hora, min, seg)) {
            System.out.println("O horário " + horario + " é um horário válido");
        } else {
            System.out.println("O horário " + horario + " não é um horário válido");
        }
    }
}
