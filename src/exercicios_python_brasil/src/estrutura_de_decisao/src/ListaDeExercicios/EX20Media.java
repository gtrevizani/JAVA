package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média
alcançada por aluno e presentar:

A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10.
 */
public class EX20Media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        Double notaUm = scanner.nextDouble();
        System.out.print("Informe a segunda nota: ");
        Double notaDois = scanner.nextDouble();
        System.out.print("Informe a terceira nota: ");
        Double notaTres = scanner.nextDouble();

        double media = (notaUm + notaDois + notaTres) / 3;

        boolean maiorQueSete = media >= 7 && media<10;
        boolean menorQueSete = media <7;
        boolean notaMaxima = media == 10;

        if(maiorQueSete){
            System.out.println("Media: " + media);
            System.out.println("Aprovado.");
        } else if (menorQueSete){
            System.out.println("Media: " + media);
            System.out.println("Reprovado.");
        } else if (notaMaxima) {
            System.out.println("Media: " + media);
            System.out.println("Aprovado com Distinção.");
        }
        scanner.close();
    }
}
