package cad07_novidades_do_java_8._11_5_api_de_data.exemplos;

import cad07_novidades_do_java_8._11_5_api_de_data.model.Carro;

import java.time.Year;
import java.util.Arrays;
import java.util.List;

public class CadastroCarro {

    public static void main(String[] args) {
        Carro gol = new Carro("Gol", 90.0, Year.of(2012));
        Carro cruze = new Carro("Cruze", 200.0, Year.parse("2013"));
        Carro celta = new Carro("Celta", 80.0, Year.of(2011));

        List<Carro> carros = Arrays.asList(gol, cruze, celta);
        carros.stream()
                .filter(c -> c.getAnoFabricacao().isAfter(Year.of(2012)))
                .forEach(c -> System.out.println(c.getModelo()));
    }
}
