package exercicio03;

public class Produto {
    String nome;
    int quantidade;

    public void descrever(Produto produto){
        System.out.println("Nome: " + nome + "\n" + "Quantidade: " + quantidade);
    }
}
