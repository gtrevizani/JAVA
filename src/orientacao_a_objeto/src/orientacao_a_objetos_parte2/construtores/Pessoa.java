package orientacao_a_objetos_parte2.construtores;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) { // Botao direito, Generate, Constructor;
        this(nome); // Conceito para não repetir linha (8 e 12);
        this.idade = idade;
    }
}
