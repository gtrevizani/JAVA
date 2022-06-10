package cad03_topicos_avancados.teoria.ATT08_MAIS_DETALHES_E_FRAMEWORKS._8_2_introducao_a_generics;

import java.util.List;

public class RetiraElementos {

    public static <T> T recuperarPrimeiro(List<T> lista){ //
        return lista.get(0);
    }
}
