package programacao_orientada_a_objetos.primeira_classe;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Smarthphone";
        produto.precoUnitario = 500.0;
        produto.quantidade = 15;
        exibirQuantidadeEmEstoque(produto);
    }
    static void exibirQuantidadeEmEstoque(Produto produto){
        System.out.println("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade + " unidade(s).");
    }
}
