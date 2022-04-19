package metodos;

import java.util.Scanner;

/*
Crie um programa que peça dois números do usuário e também qual a operação ele deseja fazer - adição ou subtração.
 Para cada operação, você deve construir um método que realize a mesma, ou seja, teremos um método para adição,
 que vai receber dois números como parâmetros e retornar o resultado da soma entre eles, e outro método para subtração.
Fique a vontade para implementar multiplicação e divisão também.
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double numeroEsquerda = informeNumero(scanner);

        Integer operacao = escolhaAOperacao(scanner);

        Double numeroDireita = informeNumero(scanner);

        Double resultado = realizarCalculo(operacao, numeroEsquerda, numeroDireita);
        System.out.println("O resultado é: " + resultado);
        scanner.close();
    }

    static Double informeNumero(Scanner scanner) {
        System.out.print("Informe o número: ");
        return scanner.nextDouble();
    }

    static Integer escolhaAOperacao(Scanner scanner) {
        System.out.println("ESCOLHA A OPERAÇÃO");
        String[] operacoes = new String[]{"Subtração", "Adição"};
        for (int i = 0; i < operacoes.length; i++) {
            System.out.println("[" + i + "] " + operacoes[i]);
        }
        System.out.print("Digite a operação: ");
        return scanner.nextInt();
    }

    static Double adicao(Double numeroEsquerda, Double numeroDireita) {
        return numeroEsquerda + numeroDireita;
    }

    static Double subtracao(Double numeroEsquerda, Double numeroDireita) {
        return numeroEsquerda - numeroDireita;
    }

    static Double realizarCalculo(Integer operacao, Double numeroEsquerda, Double numeroDireita) {
        Double resultado = null;
        switch (operacao) {
            case 0:
                resultado = subtracao(numeroEsquerda, numeroDireita);
                break;
            case 1:
                resultado = adicao(numeroEsquerda, numeroDireita);
                break;
            default:
                System.err.println("Escolha uma operação válida!");
                System.exit(0);
        }
        return resultado;
    }
}