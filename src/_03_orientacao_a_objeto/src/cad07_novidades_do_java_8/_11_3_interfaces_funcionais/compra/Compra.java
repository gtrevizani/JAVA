package cad07_novidades_do_java_8._11_3_interfaces_funcionais.compra;

public class Compra {
    private String produto;
    private double valor;

    public Compra(String produto, double valor) {
        this.produto = produto;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Compra{" +
                "produto='" + produto + '\'' +
                ", valor=" + valor +
                '}';
    }
}
