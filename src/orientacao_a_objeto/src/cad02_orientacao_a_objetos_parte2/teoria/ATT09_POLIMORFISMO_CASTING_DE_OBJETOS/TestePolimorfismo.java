package cad02_orientacao_a_objetos_parte2.teoria.ATT09_POLIMORFISMO_CASTING_DE_OBJETOS;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        TestePolimorfismo.imprimirSaldo(conta);
        //-------------------------------------
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        System.out.println();
        //-------------------------------------
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }

    private static void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$" + conta.getSaldo());
        if(conta instanceof ContaCorrente){
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da cc é R$" + cc.getLimite());
        }
        if(conta instanceof ContaPoupanca){
            ContaPoupanca cp = (ContaPoupanca) conta;
            System.out.println("O rendimento da cp é R$" + cp.getRendimentos());
        }
    }
}
