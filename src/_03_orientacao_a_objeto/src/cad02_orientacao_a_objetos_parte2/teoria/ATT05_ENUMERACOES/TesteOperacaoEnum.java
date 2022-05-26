package cad02_orientacao_a_objetos_parte2.teoria.ATT05_ENUMERACOES;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritmetica o1 = OperacaoAritmetica.ADICAO; // Instanciamento com propriedade
        int resultado1 = o1.operacao(5, 3); // Constructor
        System.out.println("O resultado é: " + resultado1); // Exibição
        OperacaoAritmetica o2 = OperacaoAritmetica.SUBTRACAO;
        int resultado2 = o2.operacao(5, 3);
        System.out.println("O resultado é: " + resultado2);
    }
}
