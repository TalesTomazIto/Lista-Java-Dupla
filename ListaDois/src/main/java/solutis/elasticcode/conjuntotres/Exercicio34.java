package solutis.elasticcode.conjuntotres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Exercicio34 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 1; i <= 50; i++) {
            System.out.printf("%d ", r.nextInt(1, 100));
        }
    }
}
