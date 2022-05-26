package cad01_orientacao_a_objetos.pratica.EX01_ALGORITMO_PASSEIO;

public class Caminhada {
    public void andar(Pessoa pessoa){ // Método público
        System.out.println("Eu \"" + pessoa.nome + "\"" + " estou andando com o \"" + pessoa.cachorro.nome + "\".");
    }
}
