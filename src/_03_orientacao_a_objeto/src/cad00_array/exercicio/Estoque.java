package cad00_array.exercicio;

public class Estoque { // Objeto
    Produto[] produtos; // Atributo em forma de vetor

    void listarProdutos(){ // Método
        System.out.println("Produtos em estoque: ");
        System.out.println("---------------------");
        for (int i = 0; i < produtos.length; i++){
            produtos[i].descrever();
        }
    }
}
