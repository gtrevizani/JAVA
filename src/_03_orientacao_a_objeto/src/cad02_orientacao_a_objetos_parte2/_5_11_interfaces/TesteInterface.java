package cad02_orientacao_a_objetos_parte2._5_11_interfaces;

public class TesteInterface {
    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234); // Construtor Nota Fiscal espera numero.
        i.imprimir();
        EnviavelPorEmail e = (EnviavelPorEmail) i; // Casting (EnviavelPorEmail), transformando ContaCorrente variavel i na variavel e;
        e.enviar("guilhermetrevz@outlook.com");
        NotaFiscal n = (NotaFiscal) e; // Casting (NotaFiscal), transformando ContaCorrente variavel e na variavel n;
        n.adicionarPedido("caixa de leite");
    }
}
