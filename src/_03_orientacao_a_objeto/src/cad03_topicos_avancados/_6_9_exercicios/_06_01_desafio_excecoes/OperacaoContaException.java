package cad03_topicos_avancados._6_9_exercicios._06_01_desafio_excecoes;

public class OperacaoContaException extends Exception{ // Classe exceção, que extends Exception.
    public OperacaoContaException(String msg) { // Construtor que recebe parâmetro
        super(msg); // Invoca o parâmetro
    }
}
