package orientacao_a_objetos_parte2.o_objeto_this.desafio_objeto_this_e_construtores;

public class ContaPagar { // Primeiro.
    String descricao;
    Double valor;
    String dataVencimento;
    Fornecedor fornecedor;

    public ContaPagar(){

    }

    public ContaPagar(String descricao, Double valor, String dataVencimento, Fornecedor fornecedor) { // Construtor.
        this.descricao = descricao;
        this.valor = valor;
        this.dataVencimento = dataVencimento;
        this.fornecedor = fornecedor;
    }
    void pagar(){ // Método para exibição.
        System.out.println("Pagando conta " + this.getDescricao() + " no valor de " + this.getValor() +
                " e vencimento em " + getDataVencimento() + " do fornecedor " + getFornecedor().getNome() + ".");
    }

    public String getDescricao() { // Getter and Setters.
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
}
