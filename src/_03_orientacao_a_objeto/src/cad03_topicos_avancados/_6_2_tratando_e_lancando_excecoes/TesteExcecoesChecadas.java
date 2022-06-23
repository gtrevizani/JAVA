package cad03_topicos_avancados._6_2_tratando_e_lancando_excecoes;

public class TesteExcecoesChecadas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(110); // Constructor

        try { // Teste
            cc.sacar(500);
        } catch ( SaldoInsuficienteException e) { // Try não é o correto, execute o Catch.
            System.out.printf("Desculpe, saldo insuficiente.\n");
        }
        System.out.println("Saldo: " + cc.getSaldo());

        try { // Teste
            cc.sacar(50);
        } catch ( SaldoInsuficienteException e) { // Try não é o correto, execute o Catch.
            System.out.println("Desculpe, saldo insuficiente.");
        }
        finally { // Por fim, execute o Finally.
            System.out.println("Obrigado por utilizar nosso sitema!");
        }
        System.out.println("Saldo agora: " + cc.getSaldo());
    }
}
