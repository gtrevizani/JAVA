package cad02_orientacao_a_objetos_parte2.pratica._05_05_desafio_classes_abstratas;

public abstract class Produto {
    String descricao;
    public abstract void imprimirDescricao();
    public String getDescricao() {
        return descricao;
    }
}