package cad02_orientacao_a_objetos_parte2._5_12_exercicios._05_05_desafio_classes_abstratas;

public class ProdutoPerecivel extends Produto{
    String dataValidade;

    @Override
    public void imprimirDescricao(){
        System.out.println("Descrição: " + super.getDescricao() + ". Vencendo em: " + dataValidade);
    }
}
