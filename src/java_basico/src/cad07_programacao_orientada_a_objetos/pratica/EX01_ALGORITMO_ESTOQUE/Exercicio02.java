package cad07_programacao_orientada_a_objetos.pratica.EX01_ALGORITMO_ESTOQUE;
/*
Faça exatamente como no exercício passado, só que agora torne o método, que verifica a necessidade de repor estoque,
 como um método de instância.
Lembre-se de que ele não precisará mais receber parâmetros, pois, usará as próprias variáveis de instância
da classe Produto.
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Product product = new Product(); // Objeto instanciado
        product.nome = "SpainerHow"; // Objeto e atributo
        product.quantidadeEmEstoque = 11; // Objeto e atributo
        System.out.println("Reposição de " + product.nome + " necessária? " + product.exigeReposicao());
        // Método de chamada (requer instanciamento);
    }
}
