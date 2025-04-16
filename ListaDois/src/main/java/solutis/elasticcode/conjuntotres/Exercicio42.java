package solutis.elasticcode.conjuntotres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Exercicio42 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 40; i++) {
            List<Integer> grupo = new ArrayList<>();

            for (int j = 1; j <= 3; j++) {
                int num = random.nextInt(60);
                grupo.add(num);
            }

            Collections.sort(grupo);

            System.out.println("Grupo " + i + ": " + grupo);
        }


    }
}
