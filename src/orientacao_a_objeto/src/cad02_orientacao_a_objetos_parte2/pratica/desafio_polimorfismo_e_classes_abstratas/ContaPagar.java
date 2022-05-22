package cad02_orientacao_a_objetos_parte2.pratica.desafio_polimorfismo_e_classes_abstratas;


public class ContaPagar extends Conta { // Classe filha, herda da classe pai Conta.

    private Fornecedor fornecedor; // Atributo privado.

    public ContaPagar() {
    }

    public ContaPagar(Fornecedor fornecedor, String descricao, Double valor, String dataVencimento) {
        this.fornecedor = fornecedor;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    } // Construtor

    public void pagar() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que já está paga: "
                    + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que está cancelada: "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Pagando conta " + this.getDescricao() + " no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do fornecedor " + this.getFornecedor().getNome() + ".");

            // altera situação da conta para PAGA
            this.situacaoConta = SituacaoConta.PAGA;
        }
    } // Método pagar com situações.

    public Fornecedor getFornecedor() {
        return this.fornecedor;
    } // Método de exibição
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    } // Método de atribuição

}
