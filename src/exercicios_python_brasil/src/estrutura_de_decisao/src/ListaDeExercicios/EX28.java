import java.util.Scanner;

public class Atividade_28 {
    static final byte UM = 1;
    static final byte DOIS = 2;
    static final byte TRES = 3;
    static final byte CINCO = 5;
    static final byte CEM = 100;
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
        System.out.print("Digite a quantidade desejada(Kg   ): ");
        int quantidadeDeCarne = scanner.nextInt();
        System.out.print("A compra sera feita via cartao tabajara (1)sim (2)nao: ");
        byte decisaoDeCompraViaCartao = scanner.nextByte();

        double precoDaCarne = 0;
        double precoTotalDaCarne = 0;
        String decisaoDeCarne;

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
        } if (precoDaCarne == UM) {
            double descontoDeCincoPorcento = ((precoDaCarne - CINCO) / CEM);
            precoTotalDaCarne = precoDaCarne - descontoDeCincoPorcento;
        } else {
            precoTotalDaCarne = precoDaCarne;
        }

        System.out.print("**********CUPOM FISCAL**********\n");
        System.out.print("Carne..........." + decisaoDeCarne);
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        System.out.print("");
        scanner.close();
    }
} //incompleto
