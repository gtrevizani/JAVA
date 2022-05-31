package cad03_topicos_avancados.teoria.ATT01_TRATANDO_E_LANCANDO_EXCECOES;

public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        if ( deposito <= 0) {
            throw new IllegalArgumentException("O valor não pode ser menor que zero.");
        }
        this.saldo += deposito;
    }

    public void sacar(double quantidade) throws SaldoInsuficienteException {
        double saldoTemp = saldo - quantidade;
        if (saldoTemp < 0) {
            throw  new SaldoInsuficienteException("Você não possui saldo suficiente");
        }
        this.saldo -= quantidade;
    }

    public double getSaldo() {
        return saldo;
    }

}
