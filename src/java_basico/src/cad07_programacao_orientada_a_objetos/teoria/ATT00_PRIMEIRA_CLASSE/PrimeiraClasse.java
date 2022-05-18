package cad07_programacao_orientada_a_objetos.teoria.ATT00_PRIMEIRA_CLASSE;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto(); // Objeto instanciado

        produto.nome = "Smarthphone"; // Objeto e atributo
        produto.precoUnitario = 500.0; // Objeto e atributo
        produto.quantidade = 15; // Objeto e atributo
        exibirQuantidadeEmEstoque(produto); // Método com parâmetro
    }
    static void exibirQuantidadeEmEstoque(Produto produto){
        System.out.println("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade + " unidade(s).");
    } // Método de exibição
}
