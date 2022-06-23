package cad07_novidades_do_java_8._11_2_referencia_a_metodos.modelo;

public class Fatura {

    private String emailDevedor;
    private double valor;

    public Fatura(String emailDevedor, double valor) {
        this.emailDevedor = emailDevedor;
        this.valor = valor;
    }

    public String getEmailDevedor() {
        return emailDevedor;
    }

    public void setEmailDevedor(String emailDevedor) {
        this.emailDevedor = emailDevedor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String resumo(){
        return "Valor devido: " + valor;
    }

    public void atualizarStatus(){
        System.out.println("Atualizando status da fatura de valor R$ " + valor);
    }
}
