package cad02_orientacao_a_objetos_parte2.pratica.desafio_polimorfismo_e_classes_abstratas;

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
    public void exibirListagem(Conta[] contas){
        // 1 - while para percorrer
        // 2 - polimorfismo para exibir conta a pagar e receber
        // 3 - todos os detalhes para ContaPagar: descrição, valor, datavencimento, fornecedor.
        // todos os detalhes para ContaReceber: descrição, valor, datavencimento, cliente.
        int i = 0;
        while(i<contas.length){
            if(contas[i] instanceof ContaPagar){
                System.out.println("CONTA {" + i + "}: " + " A PAGAR");
                System.out.println("Descrição: " + contas[i].getDescricao() + "\nValor: " + contas[i].getValor() +
                        "\nData de Vencimento: " + contas[i].getDataVencimento() + "\nSituação: " + contas[i].getSituacaoConta() + "\n");
            }
            if(contas[i] instanceof ContaReceber){
                System.out.println("CONTA {" + i + "}: " + "A RECEBER");
                System.out.println("Descrição: " + contas[i].getDescricao() + "\nValor: " + contas[i].getValor() +
                        "\nData de Vencimento: " + contas[i].getDataVencimento() + "\nSituação: " + contas[i].getSituacaoConta() + "\n");
            }
            i++;
        }
    }

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
