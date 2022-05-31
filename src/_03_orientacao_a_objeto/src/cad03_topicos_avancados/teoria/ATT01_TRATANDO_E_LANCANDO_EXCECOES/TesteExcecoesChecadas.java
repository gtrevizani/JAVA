package cad03_topicos_avancados.teoria.ATT01_TRATANDO_E_LANCANDO_EXCECOES;

public class TesteExcecoesChecadas {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(100);

        try {
            cc.sacar(60);
        } catch ( SaldoInsuficienteException e) {
            System.out.printf("Desculpe, saldo insuficiente.");
        }
        System.out.println("Saldo: " + cc.getSaldo());

        try {
            cc.sacar(50);
        } catch ( SaldoInsuficienteException e) {
            System.out.println("Desculpe, saldo insuficiente.");
        }
        finally {
            System.out.println("Obrigado por utilizar nosso sitema!");
        }
        System.out.println("Saldo agora: " + cc.getSaldo());
    }
}
