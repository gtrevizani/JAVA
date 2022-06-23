package cad07_novidades_do_java_8._11_2_referencia_a_metodos.dao;

import cad07_novidades_do_java_8._11_2_referencia_a_metodos.modelo.Fatura;

import java.util.ArrayList;
import java.util.List;

public class FaturaDAO {

    public List<Fatura> buscarFaturasVencidas(){
        // Obviamente você buscaria isso no banco de dados...

        List<Fatura> faturas = new ArrayList<>();
        faturas.add(new Fatura("filipe@gmail.com", 350.0));
        faturas.add(new Fatura("maria@gmail.com", 150.0));
        faturas.add(new Fatura("jose@gmail.com", 290.0));

        return faturas;
    }
}
