package cad07_novidades_do_java_8._11_2_referencia_a_metodos.exemplo;

import cad07_novidades_do_java_8._11_2_referencia_a_metodos.dao.FaturaDAO;
import cad07_novidades_do_java_8._11_2_referencia_a_metodos.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class Exemplo {

    public static void main(String[] args) {
        List<Fatura> faturasVencidas = new FaturaDAO().buscarFaturasVencidas();

        /*for (Fatura f : faturasVencidas){ 1° forma
            f.atualizarStatus();
        }
        */

        // faturasVencidas.forEach(f -> f.atualizarStatus()); 2° forma

        faturasVencidas.forEach(Fatura::atualizarStatus);
    }
}
