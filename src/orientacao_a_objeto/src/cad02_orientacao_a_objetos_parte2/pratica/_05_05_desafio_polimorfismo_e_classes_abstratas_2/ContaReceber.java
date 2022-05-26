package cad02_orientacao_a_objetos_parte2.pratica._05_05_desafio_polimorfismo_e_classes_abstratas_2;

public class ContaReceber extends Conta { // Classe filha que herda da classe pai Conta.

    private Cliente cliente; // Atributo privado.

    public ContaReceber() {
    }

    public ContaReceber(Cliente cliente, String descricao, Double valor, String dataVencimento) {
        this.cliente = cliente;
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setDataVencimento(dataVencimento);
    } // Constructor

    public void cancelar() {
        if (this.getValor() > 50000d) {
            System.out.println("Essa conta a receber não pode ser cancelada. " +
                    "É muito dinheiro para deixar de receber: " + this.getDescricao());
        } else {
            super.cancelar();
        }
    } // Método cancelar

    public void exibirDetalhes() {
        System.out.println("\nConta a Receber");
        System.out.println("===================================");
        System.out.println("Cliente: " + this.getCliente().getNome());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Data de vencimento: " + this.getDataVencimento());
        System.out.println("Situação: " + this.getSituacaoConta());
        System.out.println("===================================");
    } // Método exibir detalhes

    public void receber() {
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que já está paga: "
                    + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode receber uma conta que está cancelada: "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Recebendo conta " + this.getDescricao() + " no valor de "
                    + this.getValor() + " e vencimento em " + this.getDataVencimento()
                    + " do cliente " + this.getCliente().getNome() + ".");

            // altera situação da conta para PAGA
            this.situacaoConta = SituacaoConta.PAGA;
        }
    } // Método receber

    public Cliente getCliente() {
        return this.cliente;
    } // Método de exibição
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    } // Método de atribuição

}
