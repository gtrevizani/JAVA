package cad02_orientacao_a_objetos_parte2._5_12_exercicios._05_06_exercicio_interface_e_polimorfismo;

public class CorretoraSeguros {
    public void fazerPropostaSeguro(Seguravel objetoSeguravel){
        System.out.println("--------------------------------");
        System.out.println("Corretora de Seguros - Proposta");
        System.out.println("--------------------------------");
        System.out.println(objetoSeguravel.obterDescricao());
        System.out.println("Valor da apólice: " + objetoSeguravel.calcularValorApolice());
        System.out.println("--------------------------------\n");
    }
}
