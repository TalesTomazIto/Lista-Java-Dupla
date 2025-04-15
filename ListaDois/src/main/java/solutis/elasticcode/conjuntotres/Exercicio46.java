package solutis.elasticcode.conjuntotres;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Pessoa {
    public String sexo;
    public int idade;

    public Pessoa(String sexo, int idade) {
        this.sexo = sexo;
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
}

public class Exercicio46 {
    public static void main(String[] args) {
        List<Pessoa> p = new ArrayList<>();
        Random r = new Random();

        for (int i = 1; i < 200; i++) {
            String sexo = r.nextBoolean() ? "Homem" : "Mulher";
            int idade = r.nextInt(1, 100);

            p.add(new Pessoa(sexo, idade));
        }

        int mulherMaior = 0;
        int homemMaior = 0;

        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getSexo().equals("Mulher")) {
                if (p.get(i).getIdade() >= 18) {
                    mulherMaior++;
                }
            } else if (p.get(i).getSexo().equals("Homem")) {
                if (p.get(i).getIdade() >= 18) {
                    homemMaior++;
                }
            }
        }

        System.out.printf("Dessas 200 pessoas, %d homens e %d mulheres são maiores de idade.", homemMaior, mulherMaior);
    }
}
