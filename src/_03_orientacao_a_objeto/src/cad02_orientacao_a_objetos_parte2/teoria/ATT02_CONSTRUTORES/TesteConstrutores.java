package cad02_orientacao_a_objetos_parte2.teoria.ATT02_CONSTRUTORES;

public class TesteConstrutores {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Joao");
        System.out.println("Nome: " + p1.nome + " tem " + p1.idade + " anos.");
        Pessoa p2 = new Pessoa("Maria", 22);
        System.out.println("Nome: " + p2.nome + " tem " + p2.idade + " anos.");
    }
}
