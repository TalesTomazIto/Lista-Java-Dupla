package solutis.elasticcode.conjuntotres.exercicio47;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio47 {

    public int getQtdPessoas(List<Pessoa> pessoas) {
        return pessoas.size();
    }

    public double mediaIdadeHomens(List<Pessoa> pessoas) {
        double total = 0.0;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getSexo() == "M") {
                total += pessoas.get(i).getIdade();
            }
        }
        return total / pessoas.size();
    }

    public int qtdMulheresFiltradas(List<Pessoa> pessoas) {
        int qtdMulheres = 0;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getSexo().equals("F")) {
                if (pessoas.get(i).getAltura() > 1.6 &&
                        pessoas.get(i).getAltura() < 1.7 &&
                        pessoas.get(i).getPeso() > 70.0) {
                    qtdMulheres++;
                }
            }
        }
        return qtdMulheres;
    }

    public int pessoasEntre18E25(List<Pessoa> pessoas) {
        int qtd = 0;
        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).getIdade() > 18 && pessoas.get(i).getIdade() < 25) {
                qtd++;
            }
        }
        return qtd;
    }

    public String pacienteMaisVelho(List<Pessoa> pessoas) {
        Pessoa pessoaVelha = pessoas.get(0);
        int maiorIdade = pessoas.get(0).getIdade();

        for (int i = 0; i < pessoas.size(); i++) {
            if (maiorIdade < pessoas.get(i).getIdade()) {
                pessoaVelha = pessoas.get(i);
            }
        }

        return pessoaVelha.getNome();
    }

    public String mulherMaisBaixa(List<Pessoa> pessoas) {
        Pessoa pessoaVelha = pessoas.get(0);
        double menorAltura = pessoas.get(0).getAltura();

        for (int i = 0; i < pessoas.size(); i++) {
            if (menorAltura > pessoas.get(i).getAltura()) {
                pessoaVelha = pessoas.get(i);
            }
        }

        return pessoaVelha.getNome();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exercicio47 exercicio = new Exercicio47();
        String nome = "";
        String sexo;
        Double peso;
        Integer idade;
        Double altura;
        List<Pessoa> pessoas = new ArrayList<>();

        while (nome != "fim") {

            System.out.println("Digite o nome do cliente: ");
            nome = sc.nextLine().toLowerCase();
            if (nome == "fim") {
                break;
            }
            System.out.println("Digite o sexo do cliente: (M ou F)");
            sexo = sc.nextLine().toUpperCase();
            System.out.println("Digite o peso do cliente: ");
            peso = sc.nextDouble();
            System.out.println("Digite a idade do usuário: ");
            idade = sc.nextInt();
            System.out.println("Digite a altura do usuário: ");
            altura = sc.nextDouble();

            Pessoa pessoa = new Pessoa(nome, sexo, peso, idade, altura);
            pessoas.add(pessoa);
        }

        System.out.println("A quantidade de pessoas cadastradas é: ");
        System.out.println(exercicio.getQtdPessoas(pessoas));

        System.out.println("A média de idade dos homens é: ");
        System.out.println(exercicio.mediaIdadeHomens(pessoas));

        System.out.println("A quantidade de mulheres entre 1.60 e 1.70 de altura e peso acima de 70 kgs:");
        System.out.println(exercicio.qtdMulheresFiltradas(pessoas));

        System.out.println("A quantidade de pessoas entre 18 e 15 anos: ");
        System.out.println(exercicio.pessoasEntre18E25(pessoas));

        System.out.println("A pessoa mais velha se chama: ");
        System.out.println(exercicio.pacienteMaisVelho(pessoas));

        System.out.println("A mulher mais velha se chama: ");
        System.out.println(exercicio.mulherMaisBaixa(pessoas));

    }
}
