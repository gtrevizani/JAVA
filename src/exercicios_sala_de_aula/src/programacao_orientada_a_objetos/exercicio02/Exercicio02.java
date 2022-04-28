package programacao_orientada_a_objetos.exercicio02;
/*
Faça exatamente como no exercício passado, só que agora torne o método, que verifica a necessidade de repor estoque,
 como um método de instância.
Lembre-se de que ele não precisará mais receber parâmetros, pois, usará as próprias variáveis de instância
da classe Produto.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Product product = new Product();
        product.nome = "SpainerHow";
        product.quantidadeEmEstoque = 11;

        System.out.println("Reposição necessária? " + product.exigeReposicao());
    }
}
