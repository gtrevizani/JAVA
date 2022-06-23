package cad07_novidades_do_java_8._11_3_interfaces_funcionais.impressao.impressoras;

import cad07_novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;
import cad07_novidades_do_java_8._11_3_interfaces_funcionais.impressao.Impressora;

public class ImpressoraHP implements Impressora {

    @Override
    public void imprimir(Compra c){
        System.out.println("Enviando o comando para a impressora HP -> " + c);
    }
}
