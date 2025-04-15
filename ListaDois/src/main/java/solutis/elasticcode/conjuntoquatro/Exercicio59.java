package solutis.elasticcode.conjuntoquatro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio59 {
    public static void main(String[] args) {

        List<List<Integer>> matriz = new ArrayList<>();


        for (int i = 1; i <= 10; i++) {
            List<Integer> linha = new ArrayList<>();
            for (int j = 1; j <= 10; j++) {
                linha.add(i*j);
            }
            System.out.println(linha);
            matriz.add(linha);
        }

        System.out.println(matriz);
    }
}
