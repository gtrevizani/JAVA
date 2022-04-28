package programacao_orientada_a_objetos.exercicio02;

public class Product {
    String nome;
    Integer quantidadeEmEstoque;
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    Boolean exigeReposicao() {
        return quantidadeEmEstoque < QUANTIDADE_MINIMA_ESTOQUE;
    }
}
