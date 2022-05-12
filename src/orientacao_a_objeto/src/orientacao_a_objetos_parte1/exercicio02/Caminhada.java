package orientacao_a_objetos_parte1.exercicio02;

public class Caminhada {
    public void andar(Pessoa pessoa){
        System.out.println("Eu \"" + pessoa.nome + "\"" + " estou andando com o \"" + pessoa.cachorro.nome + "\".");
    }
}
