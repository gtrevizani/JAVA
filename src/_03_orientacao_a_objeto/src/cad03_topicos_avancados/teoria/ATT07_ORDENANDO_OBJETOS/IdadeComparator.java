package cad03_topicos_avancados.teoria.ATT07_ORDENANDO_OBJETOS;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        if(pessoa1.getIdade() < pessoa2.getIdade()){
            return -1;
        } else if (pessoa1.getIdade() > pessoa2.getIdade()) {
            return 1;
        }
        return 0;
    }
}
