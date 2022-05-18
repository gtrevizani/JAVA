package orientacao_a_objetos_parte2.teoria.ATT02_CONSTRUTORES;

public class Pessoa { // Objeto
    String nome; // Atributos
    int idade;

    public Pessoa(String nome) { // Constructor
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) { // Botao direito -> Generate -> Constructor;
        this(nome); // Conceito para não repetir linha (8 e 12);
        this.idade = idade;
    }
}
