package programacao_orientada_a_objetos.exercicio02;

public class Product {
    String nome;
    Integer quantidadeEmEstoque;
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    Boolean exigeReposicao() {
        return quantidadeEmEstoque < Product.QUANTIDADE_MINIMA_ESTOQUE;
    }
}
