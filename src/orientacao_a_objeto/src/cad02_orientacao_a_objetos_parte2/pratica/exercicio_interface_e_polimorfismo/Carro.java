package cad02_orientacao_a_objetos_parte2.pratica.exercicio_interface_e_polimorfismo;

public class Carro implements Seguravel{
    private int anoFabricacao;
    private Double valor;

    public Carro(int anoFabricacao, Double valor) {
        this.anoFabricacao = anoFabricacao;
        this.valor = valor;
    }

    @Override
    public String obterDescricao() {
        return "Ano: " + this.anoFabricacao + "\nValor: " + this.valor;
    }

    @Override
    public double calcularValorApolice() {
        double valorApolice = this.valor * 0.04;
        if(anoFabricacao < 2000){
            valorApolice = valorApolice * 0.90;
        }
        return valorApolice;
    }
}
