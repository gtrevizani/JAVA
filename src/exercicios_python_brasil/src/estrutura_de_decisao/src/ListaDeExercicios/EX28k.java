package estrutura_de_decisao.src.ListaDeExercicios;

import java.util.Scanner;
/*
O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                      Até 5 Kg           Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, porém não há
limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o cliente receberá ainda um
desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo e a quantidade de carne comprada pelo
usuário e gere um cupom fiscal, contendo as informações da compra: tipo e quantidade de carne, preço total, tipo de
pagamento, valor do desconto e valor a pagar.
 */
public class EX28k {
    static final byte UM = 1;
    static final byte DOIS = 2;
    static final byte TRES = 3;
    static final byte CINCO = 5;
    static final byte CEM = 100;
    static final double CINCO_PORCENTO_DE_DESCONTO = 0.05;
    static final double PRECO_DO_FILE_DUPLO = 4.90;
    static final double PRECO_DO_FILE_DUPLO_ABAIXO_DE_CINCO = 5.80;
    static final double PRECO_DA_ALCATRA = 5.90;
    static final double PRECO_DA_ALCATRA_MENOR_QUE_CINCO = 6.80;
    static final double PRECO_DA_PICANHA = 6.90;
    static final double PRECO_DA_PICANHA_MENOR_QUE_CINCO = 7.80;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("(1) file duplo\n(2) alcatra\n(3)picanha\nEscolha sua carne: ");
        byte escolhaDaCarne = scanner.nextByte();
        System.out.print("Digite a quantidade desejada(Kg): ");
        int quantidadeDeCarne = scanner.nextInt();
        System.out.print("A compra sera feita via cartao tabajara (1)sim (2)nao: ");
        byte decisaoDeCompraViaCartao = scanner.nextByte();

        double descontoDeCincoPorcento = 0;
        double precoDaCarne = 0;
        double precoTotalDaCarne = 0;
        String decisaoDeCarne = null;
        String cartaoTabajara = null;

        if(escolhaDaCarne == UM) {
            decisaoDeCarne = "file duplo";
            if(quantidadeDeCarne <= CINCO) {
                precoDaCarne = quantidadeDeCarne * PRECO_DO_FILE_DUPLO;
            } else {
                precoDaCarne = quantidadeDeCarne * PRECO_DO_FILE_DUPLO_ABAIXO_DE_CINCO;
            }
        } if (escolhaDaCarne == DOIS) {
            decisaoDeCarne = "alcatra";
            if ( quantidadeDeCarne <= CINCO) {
                precoDaCarne = quantidadeDeCarne * PRECO_DA_ALCATRA;
            } else {
                precoDaCarne = quantidadeDeCarne * PRECO_DA_ALCATRA_MENOR_QUE_CINCO;
            }
        } if (escolhaDaCarne == TRES) {
            decisaoDeCarne = "picanha";
            if (quantidadeDeCarne <= CINCO) {
                precoDaCarne = quantidadeDeCarne * PRECO_DA_PICANHA;
            } else {
                precoDaCarne = quantidadeDeCarne * PRECO_DA_PICANHA_MENOR_QUE_CINCO;
            }
        } if (decisaoDeCompraViaCartao == UM) {
            cartaoTabajara = "Sim";
            descontoDeCincoPorcento = (precoDaCarne * CINCO_PORCENTO_DE_DESCONTO);
            precoTotalDaCarne = precoDaCarne - descontoDeCincoPorcento;
        } else {
            cartaoTabajara = "Não";
            precoTotalDaCarne = precoDaCarne;
        }

        System.out.print("\n**********CUPOM FISCAL**********\n");
        System.out.print("Carne: " + decisaoDeCarne);
        System.out.print("\nQuantidade (Kg): " + quantidadeDeCarne + " Kg");
        System.out.print("\nPreço: R$ " + precoTotalDaCarne);
        System.out.print("\nCartao Tabajara: " + cartaoTabajara);
        System.out.print("\nDesconto: " + descontoDeCincoPorcento);
        System.out.print("\n********************************");
        scanner.close();
    }
}
