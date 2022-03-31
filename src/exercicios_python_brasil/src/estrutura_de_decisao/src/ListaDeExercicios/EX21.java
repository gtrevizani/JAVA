package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;

/*
Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e
depois informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10,
50 e 100 reais. O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
com a quantidade de notas existentes na máquina.

Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50,
uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50,
quatro notas de 10, uma nota de 5 e quatro notas de 1.
 */
public class EX21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Valor de saque (min: 10/max: 600): ");
        Double valorSacado = scanner.nextDouble();

        System.out.println("Notas de 1 fornecidas: ");
        System.out.println("Notas de 5 fornecidas: ");
        System.out.println("Notas de 10 fornecidas: ");
        System.out.println("Notas de 50 fornecidas: ");
        System.out.println("Notas de 100 fornecidas: ");
    }
}
