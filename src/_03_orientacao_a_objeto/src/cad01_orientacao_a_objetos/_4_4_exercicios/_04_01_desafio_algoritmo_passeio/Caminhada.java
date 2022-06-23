package cad01_orientacao_a_objetos._4_4_exercicios._04_01_desafio_algoritmo_passeio;

public class Caminhada {
    public void andar(Pessoa pessoa){ // Método público
        System.out.println("Eu \"" + pessoa.nome + "\"" + " estou andando com o \"" + pessoa.cachorro.nome + "\".");
    }
}
