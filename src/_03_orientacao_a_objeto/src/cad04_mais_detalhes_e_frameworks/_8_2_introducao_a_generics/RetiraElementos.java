package cad04_mais_detalhes_e_frameworks._8_2_introducao_a_generics;

import java.util.List;

public class RetiraElementos {

    public static <T> T recuperarPrimeiro(List<T> lista){ //
        return lista.get(0);
    }
}
