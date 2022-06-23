package cad07_novidades_do_java_8._11_3_interfaces_funcionais.impressao;

import cad07_novidades_do_java_8._11_3_interfaces_funcionais.compra.Compra;

@FunctionalInterface
public interface Impressora {

    public void imprimir(Compra c);
}
