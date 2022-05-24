package cad02_orientacao_a_objetos_parte2.pratica.exercicio_interface_e_polimorfismo;

public class Barco implements Seguravel{
    private String modelo;
    private Double valor;

    public Barco(String descricao, Double valor) {
        this.modelo = descricao;
        this.valor = valor;
    }

    @Override
    public String obterDescricao() {
        return "Modelo: " + this.modelo + "\nValor: " + this.valor;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valor * 0.04;
        return valorApolice;
    }
}
