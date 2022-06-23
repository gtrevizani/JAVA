package cad07_novidades_do_java_8._11_1_introducao_ao_lambda.dao;

import cad07_novidades_do_java_8._11_1_introducao_ao_lambda.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturasVencidas() {
        // Obviamente você buscaria isso no banco de dados...

        List<Fatura> faturas = new ArrayList<>();

        faturas.add(new Fatura("filipe@filipe.com", 350.0)); // Popula
        faturas.add(new Fatura("maria@maria.com", 150.0));
        faturas.add(new Fatura("jose@jose.com", 290.0));

        return faturas; // Retorna a lista

    }


}
