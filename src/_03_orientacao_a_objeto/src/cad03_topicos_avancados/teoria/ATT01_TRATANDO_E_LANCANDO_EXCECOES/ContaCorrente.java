package cad03_topicos_avancados.teoria.ATT01_TRATANDO_E_LANCANDO_EXCECOES;

public class ContaCorrente {

    private double saldo;

    public ContaCorrente(double saldo) { // Constructor
        this.saldo = saldo;
    }

    public void depositar(double deposito) { // Método que recebe parâmetro
        if ( deposito <= 0) { // Programação defensiva
            throw new IllegalArgumentException("O valor não pode ser menor que zero."); // Aviso
        }
        this.saldo += deposito;
    }

    public void sacar(double quantidade) throws SaldoInsuficienteException { // Método que recebe parâmetro e throws
        double saldoTemp = saldo - quantidade;
        if (saldoTemp < 0) { // Programação defensiva
            throw  new SaldoInsuficienteException("Você não possui saldo suficiente"); // Aviso
        }
        this.saldo -= quantidade;
    }

    public double getSaldo() { // Getter
        return saldo;
    }

}
