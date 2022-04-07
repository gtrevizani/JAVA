package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos:
Álcool: até 20 litros, desconto de 3% por litro, acima de 20 litros, desconto de 5% por litro

Gasolina: até 20 litros, desconto de 4% por litro, acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que
leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina),
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do
litro do álcool é R$ 1,90.
 */
public class EX26k {
    static final double PRECO_DA_GASOLINA = 2.50;
    static final double PRECO_DO_ALCOOL = 1.90;
    static final double DESCONTO_DE_TRES_PORCENTO = 0.3;
    static final double DESCONTO_DE_QUATRO_PORCENTO = 0.4;
    static final double DESCONTO_DE_CINCO_PORCENTO = 0.5;
    static final double DESCONTO_DE_SEIS_PORCENTO = 0.6;
    static final byte VINTE = 20;
    static final byte ZERO = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Seja bem-vindo(a) a nosso posto\nPor favor, insira quantos litros você deseja: ");
        double litrosDesejadosPeloCliente = scanner.nextDouble();
        System.out.print("Agora por favor digite se você deseja Gasolina(G) ou Álcool(A): ");
        char tipoDeCombustivel = scanner.next().charAt(0);

        if (tipoDeCombustivel == 'A') {
            if(litrosDesejadosPeloCliente <= VINTE && litrosDesejadosPeloCliente > ZERO) {
                double precoInicialASerPago = obterPrecoInicialASerPago(litrosDesejadosPeloCliente);
                double descontoDeAteVinteLitros = obterDescontoDeAteVinteLitros(precoInicialASerPago);
                double precoFinalASerPago = obterPrecoFinalASerPago(precoInicialASerPago, descontoDeAteVinteLitros);
                System.out.print("Você terá de pagar: R$ " + precoFinalASerPago);
            } else if (litrosDesejadosPeloCliente > VINTE) {
                double precoInicialASerPago = obterPrecoInicialASerPagoSeAlcoolMaiorQueVinte(litrosDesejadosPeloCliente);
                double descontoAcimaDeVinte = obterDescontoAcimaDeVinteSeAlcoolMaiorQueVinte(precoInicialASerPago);
                double precoFinalASerPago = obterPrecoFinalASerPagoSeAlcoolMaiorQueVinte(precoInicialASerPago, descontoAcimaDeVinte);
                System.out.print("Você terá de pagar: R$ " + precoFinalASerPago);
            }
        } else if (tipoDeCombustivel == 'G') {
            if(litrosDesejadosPeloCliente <= VINTE && litrosDesejadosPeloCliente > ZERO) {
                double precoInicialASerPago = obterPrecoInicialASerPagoSeGasolinaMenorQueVinte(litrosDesejadosPeloCliente);
                double descontoDeAteVinteLitros = obterDescontoDeAteVinteLitrosSeGasolinaMenorQueVinte(precoInicialASerPago);
                double precoFinalASerPago = obterPrecoFinalASerPagoSeGasolinaMenorQueVinte(precoInicialASerPago, descontoDeAteVinteLitros);
                System.out.print("Você terá de pagar: R$ " + precoFinalASerPago);
            } else if (litrosDesejadosPeloCliente > VINTE) {
                double precoInicialASerPago = obterPrecoInicialASerPagoSeGasolinaMaiorQueVinte(litrosDesejadosPeloCliente);
                double descontoAcimaDeVinte = obterDescontoAcimaDeVinteSeGasolinaMaiorQueVinte(precoInicialASerPago);
                double precoFinalASerPago = getPrecoFinalASerPago(precoInicialASerPago, descontoAcimaDeVinte);
                System.out.print("Você terá de pagar: R$ " + precoFinalASerPago);
            } else {
                System.out.print("Digite um caracter válido para realizar a compra do combustível...");
            }
        }
        scanner.close();
    }

    private static double getPrecoFinalASerPago(double precoInicialASerPago, double descontoAcimaDeVinte) {
        return precoInicialASerPago - descontoAcimaDeVinte;
    }

    private static double obterDescontoAcimaDeVinteSeGasolinaMaiorQueVinte(double precoInicialASerPago) {
        return DESCONTO_DE_SEIS_PORCENTO * precoInicialASerPago;
    }

    private static double obterPrecoInicialASerPagoSeGasolinaMaiorQueVinte(double litros_Desejados_Pelo_Cliente) {
        return PRECO_DA_GASOLINA * litros_Desejados_Pelo_Cliente;
    }

    private static double obterPrecoFinalASerPagoSeGasolinaMenorQueVinte(double precoInicialASerPago, double descontoDeAteVinteLitros) {
        return precoInicialASerPago - descontoDeAteVinteLitros;
    }

    private static double obterDescontoDeAteVinteLitrosSeGasolinaMenorQueVinte(double precoInicialASerPago) {
        return DESCONTO_DE_QUATRO_PORCENTO * precoInicialASerPago;
    }

    private static double obterPrecoInicialASerPagoSeGasolinaMenorQueVinte(double litros_Desejados_Pelo_Cliente) {
        return PRECO_DA_GASOLINA * litros_Desejados_Pelo_Cliente;
    }

    private static double obterPrecoFinalASerPagoSeAlcoolMaiorQueVinte(double precoInicialASerPago, double descontoAcimaDeVinte) {
        return precoInicialASerPago - descontoAcimaDeVinte;
    }

    private static double obterDescontoAcimaDeVinteSeAlcoolMaiorQueVinte(double precoInicialASerPago) {
        return DESCONTO_DE_CINCO_PORCENTO * precoInicialASerPago;
    }

    private static double obterPrecoInicialASerPagoSeAlcoolMaiorQueVinte(double litros_Desejados_Pelo_Cliente) {
        return PRECO_DO_ALCOOL * litros_Desejados_Pelo_Cliente;
    }

    private static double obterPrecoFinalASerPago(double precoInicialASerPago, double descontoDeAteVinteLitros) {
        return precoInicialASerPago - descontoDeAteVinteLitros;
    }

    private static double obterDescontoDeAteVinteLitros(double precoInicialASerPago) {
        return DESCONTO_DE_TRES_PORCENTO * precoInicialASerPago;
    }

    private static double obterPrecoInicialASerPago(double litros_Desejados_Pelo_Cliente) {
        return PRECO_DO_ALCOOL * litros_Desejados_Pelo_Cliente;
    }
}
