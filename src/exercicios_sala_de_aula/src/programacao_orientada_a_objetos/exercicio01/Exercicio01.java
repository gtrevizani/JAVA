package programacao_orientada_a_objetos.exercicio01;

/*
Crie um método que informa necessidade de repor estoque

Crie um programa que contenha um método que verifique a necessidade de repor o estoque de determinado produto em uma
loja qualquer.

Considere que a quantidade mínima de um produto deva ser 10.
Se o estoque for menor que isso, então ele retornará *true*,
pois, será necessária a reposição do estoque,
caso contrário, ele retornará false.

Como parâmetro, esse método deverá receber um tipo que você irá criar e chamar de Product,
ou seja,
você vai criar uma classe chamada Product com os atributos necessários.

Os atributos da classe serão nome e quantidadeEstoque.
Feito isso, implemente o método main do programa.

Nele você vai criar uma variável do tipo Product e depois usar essa
variável para invocar o método que valida a necessidade de reposição de estoque.

No final, você vai exibir, no console, se é necessária a reposição ou não.
 */
public class Exercicio01 {
    public static void main(String[] args) { // Void - método de comando
        Product product = new Product();
        product.nome = "SpinninSplaind";
        product.quantidadeEstoque = 9;

        System.out.println("Reposição de " + product.nome + " necessária? " + verficarReposicaoDeProduto(product));
    }

    static boolean verficarReposicaoDeProduto(Product product) {
        return product.quantidadeEstoque < Product.QUANTIDADE_MINIMA_ESTOQUE; // Return - método de consulta (query)
    }
}
