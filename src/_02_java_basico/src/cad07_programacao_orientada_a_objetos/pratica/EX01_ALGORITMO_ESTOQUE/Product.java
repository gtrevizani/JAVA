package cad07_programacao_orientada_a_objetos.pratica.EX01_ALGORITMO_ESTOQUE;

public class Product {
    String nome; // Atributo do objeto
    Integer quantidadeEmEstoque;
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10; // Atributo como constante

    Boolean exigeReposicao() {
        return quantidadeEmEstoque < Product.QUANTIDADE_MINIMA_ESTOQUE;
    } // Método interno de chamada;
}
