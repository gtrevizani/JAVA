package cad03_topicos_avancados.teoria.ATT10_NOVIDADES_DO_JAVA_7._10_1_separador_de_digitos_em_literais_numericos;

public class ExemploSeparadorDigitosLiterais {
    public static void main(String[] args) {
        long populacaoSaoPaulo = 11_000_000L;
        long populacaoGrandeSaoPaulo = 11_000_000L + 9_000_000;

        System.out.printf("População São Paulo: %d\n", populacaoSaoPaulo);
        System.out.printf("População da Grande São Paulo: %d\n", populacaoGrandeSaoPaulo);

        double precoVeiculo = 200_000.99_1d;
        System.out.printf("Preço veículo: %.3f\n", precoVeiculo);

        // Evitar usar assim
        int x = 1___2___3;
        int y = 1_2_3;
        System.out.printf("São iguais: %b\n", (x == y));
    }
}
