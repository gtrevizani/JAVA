package cad02_orientacao_a_objetos_parte2.pratica._05_05_desafio_polimorfismo_e_classes_abstratas_2;

public class RelatorioContas {

    public void exibirListagem(Conta[] contas) {
        System.out.println("*************************************");
        System.out.println("RELATÓRIO DE CONTAS A PAGAR E RECEBER");
        System.out.println("*************************************");

        for (int i = 0; i < contas.length; i++) {
            contas[i].exibirDetalhes();
        }

        System.out.println("*************************************");
    }

}
