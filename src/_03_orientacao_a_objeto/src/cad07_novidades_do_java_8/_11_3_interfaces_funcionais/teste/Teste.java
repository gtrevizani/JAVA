package cad07_novidades_do_java_8._11_3_interfaces_funcionais.teste;

import cad07_novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;
import cad07_novidades_do_java_8._11_3_interfaces_funcionais.impressao.Impressora;
import cad07_novidades_do_java_8._11_3_interfaces_funcionais.impressao.impressoras.ImpressoraHP;

public class Teste {
    public static void main(String[] args) {
        //Impressora i = new ImpressoraHP();


        Impressora i = (c) -> {
            System.out.println("Simulando a impressão. Seria impresso: " + c);
        };

        Compra compra = new Compra("sabonete", 2.5);
        i.imprimir(compra);

    }
}
