package cad02_orientacao_a_objetos_parte2._5_12_exercicios._05_06_exercicio_interface_e_polimorfismo;

public class Imovel implements Seguravel{
    private Double areaConstruida;
    private Double valor;

    public Imovel(Double areaConstruida, Double valor) {
        this.areaConstruida = areaConstruida;
        this.valor = valor;
    }

    @Override
    public String obterDescricao() {
        return "Área por m²: " + this.areaConstruida + "\nValor: " + this.valor;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valor * 0.004;
        valorApolice = valorApolice + (areaConstruida * 0.5);
        return valorApolice;
    }
}
