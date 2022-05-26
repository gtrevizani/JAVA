package cad01_operadores.pratica;

import java.util.Scanner;

/*
Para criar uma calculadora simples você vai precisar receber três informações pelo console.
São os dois  números que participaração da operação e também a operação que será realizada.

Você vai receber o primeiro número, depois vai receber qual é a operação e, por último, o segundo número.

Para os números que você vai receber pelo console, pode utilizar a mesma funcionalidade que já utilizamos aqui (scanner).
Para receber a operação você pode receber também um número que vai indicar a mesma. Por exemplo, o número 1 será adição,
o 2 subtração, o 3 multiplicação e o 4 divisão.

Com esses três valores - os dois números e qual será a operação - você pode utilizar a estrutura de decisão if para
só realizar a operação que o usuário escolher. Se estiver com dúvidas, então volte ao material onde falamos sobre
alteração do valor de uma variável.
 */
public class EX00_ALGORITMO_CALCULADORA_SIMPLES {
    static final Integer TIPO_ADICAO = 1;
    static final Integer TIPO_SUBTRACAO = 2;
    static final Integer TIPO_MULTIPLICACAO = 3;
    static final Integer TIPO_DIVISAO = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o primeiro numero: ");
        Double primeiroNumero = scanner.nextDouble();

        System.out.println("(1) Adicao;");
        System.out.println("(2) Subtracao;");
        System.out.println("(3) Multiplicacao;");
        System.out.println("(4) Divisao.");
        System.out.print("Insira o tipo de operacao: ");
        Integer tipoOperacao = scanner.nextInt();

        if(tipoOperacao<1 || tipoOperacao>4){
            while (tipoOperacao<1 || tipoOperacao>4){
                System.out.print("Insira um tipo de operacao valido: ");
                tipoOperacao = scanner.nextInt();
            }
        }

        System.out.print("Insira o segundo numero: ");
        Double segundoNumero = scanner.nextDouble();

        boolean escolheuSoma = tipoOperacao.equals(TIPO_ADICAO);
        boolean escolheuSubtracao = tipoOperacao.equals(TIPO_SUBTRACAO);
        boolean escolheuMultiplicacao = tipoOperacao.equals(TIPO_MULTIPLICACAO);
        boolean escolheuDivisao = tipoOperacao.equals(TIPO_DIVISAO);

        if(escolheuSoma){
            double resultado = obterResultadoSoma(primeiroNumero, segundoNumero);
            System.out.println("Resultado: " + resultado);
        }else if(escolheuSubtracao){
            double resultado = obterResultadoSubtracao(primeiroNumero, segundoNumero);
            System.out.println("Resultado " + resultado);
        }else if (escolheuMultiplicacao){
            double resultado = obterResultadoMultiplicacao(primeiroNumero, segundoNumero);
            System.out.println("Resultado " + resultado);
        }else if (escolheuDivisao){
            double resultado = obterResultadoDivisao(primeiroNumero, segundoNumero);
            System.out.println("Resultado " + resultado);
        }
        scanner.close();
    }

    private static double obterResultadoSoma(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    private static double obterResultadoSubtracao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    private static double obterResultadoMultiplicacao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    private static double obterResultadoDivisao(Double primeiroNumero, Double segundoNumero) {
        return primeiroNumero / segundoNumero;
    }
}
