package estrutura_de_decisao1.src.estrutura_de_decisao;

import java.util.Scanner;

/*
Crie um programa que vai receber um número que será referente ao dia da semana (de 1 até 7).
Dependendo do número informado você deve imprimir o nome desse dia.
Se o número 1 for informado, então deverá ser impresso "domingo", se 2, então "segunda-feira" e por ai vai.
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - Domingo; \t 4 - Quarta; \t 7 - Sabado");
        System.out.println("2 - Segunda; \t 5 - Quinta;");
        System.out.println("3 - Terca; \t\t 6 - Sexta;");
        System.out.println(" ");
        System.out.print("Informe um numero: ");
        int diaDaSemana = scanner.nextByte();

        switch (diaDaSemana) {
            default -> System.out.println("Valor inválido.");
            case 1 -> System.out.println("Hoje é Domingo.");
            case 2 -> System.out.println("Hoje é Segunda.");
            case 3 -> System.out.println("Hoje é Terca.");
            case 4 -> System.out.println("Hoje é Quarta.");
            case 5 -> System.out.println("Hoje é Quinta.");
            case 6 -> System.out.println("Hoje é Sexta.");
            case 7 -> System.out.println("Hoje é Sabado.");
        }
        scanner.close();
    }
}
