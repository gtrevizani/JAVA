package cad02_orientacao_a_objetos_parte2.pratica.desafio_polimorfismo_e_classes_abstratas;

abstract class Pessoa {

    public String nome; // Atributo

    public String getNome() { // Método de exibição
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    } // Método de atribuição

}
