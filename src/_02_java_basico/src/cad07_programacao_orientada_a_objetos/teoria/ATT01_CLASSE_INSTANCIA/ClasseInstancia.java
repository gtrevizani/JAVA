package cad07_programacao_orientada_a_objetos.teoria.ATT01_CLASSE_INSTANCIA;

public class ClasseInstancia {
    public static void main(String[] args) { // Método main
        System.out.println("Quantidade minima estoque:  " + Produto.quantidadeMinimaEstoque); // Objeto e atributo público

        
        Produto produto = new Produto(); // Instanciamento
        produto.nome = "Caneca"; // Objeto instanciado com atributo
        
        Produto produto2 = new Produto(); // Instanciamento
        produto2.nome = "Carteira"; // Objeto instanciado com atributo

        System.out.println("Quantidade mínima estoque: " + Produto.quantidadeMinimaEstoque); // Objeto e atributo público

        Impressao.informacao("Produto 1: " + produto.nome); // Método público, objeto e atributo como parâmetro
        Impressao.informacao("Produto 2: " + produto2.nome); // Método público, objeto e atributo como parâmetro
    }
}
