package cad02_orientacao_a_objetos_parte2._5_12_exercicios._05_05_desafio_polimorfismo_e_classes_abstratas_2;

abstract class Conta { // Classe abstrata - pai.

    private String descricao; // Atributos
    private Double valor;
    private String dataVencimento;
    protected SituacaoConta situacaoConta; // Atributo protegido.

    public Conta() {
        this.situacaoConta = SituacaoConta.PENDENTE;
    } // Conta por padrão: PENDENTE.

    public void cancelar() { // Método cancelar com situações.
        if (SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi paga: "
                    + this.getDescricao() + ".");
        } else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode cancelar uma conta que já foi cancelada: "
                    + this.getDescricao() + ".");
        } else {
            System.out.println("Cancelando conta " + this.getDescricao() + ".");

            // altera situação da conta para CANCELADA
            this.situacaoConta = SituacaoConta.CANCELADA;
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "descricao='" + descricao + '\'' +
                ", valor=" + valor +
                ", dataVencimento='" + dataVencimento + '\'' +
                ", situacaoConta=" + situacaoConta +
                '}';
    }

    public abstract void exibirDetalhes();

    public String getDescricao() {
        return this.descricao;
    } // Método de exibição
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    } // Método de atribuição

    public Double getValor() {
        return this.valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDataVencimento() {
        return this.dataVencimento;
    }
    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public SituacaoConta getSituacaoConta() {
        return this.situacaoConta;
    }

}
