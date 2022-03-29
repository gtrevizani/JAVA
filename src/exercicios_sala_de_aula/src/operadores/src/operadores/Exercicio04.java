package operadores.src.operadores;

import java.util.Scanner;
/*
    Crie um programa que receba a idade de uma pessoa e a quantidade de tempo que essa pessoa contribuiu com a
    previdência, depois verifique se ela pode aposentar ou não.

    Nas regras desse programa a pessoa vai precisar ter, pelo menos, 55 anos e ter contribuído com, pelo menos, 25 anos.
    Se ela passar nessas duas condições, então mostre pra ela uma mensagem dizendo que ela pode aposentar.
     */
public class Exercicio04 {
    static final Integer IDADE_MINIMA = 55;
    static final Integer CONTRIBUICAO_MINIMA = 25;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Insira a quantidade de tempo contribuindo com a previdencia: ");
        double tempoDeContribuicao = scanner.nextDouble();

        boolean temIdadeParaAposentar = idade >= IDADE_MINIMA;
        boolean temTempoDeContribuicaoSuficiente = tempoDeContribuicao >= CONTRIBUICAO_MINIMA;
        boolean podeAposentar = temIdadeParaAposentar && temTempoDeContribuicaoSuficiente;

        if(podeAposentar){
            System.out.println("Voce pode se aposentar.");
        } else {
            System.out.println("Nao pode se aposentar.");
        }
        scanner.close();
    }
}
