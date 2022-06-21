package cad03_topicos_avancados.teoria.ATT10_NOVIDADES_DO_JAVA_7._10_3_diamond;

import java.util.*;

public class ExemploDiamond {
    public static void main(String[] args) {
        List<String> nomesClientes = new ArrayList<>();
        nomesClientes.add("João");
        nomesClientes.add("Maria");

        Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
        carrosPorMontadora.put("Chevrolet", new HashSet<String>());
        carrosPorMontadora.get("Chevrolet").add("Cruze");
    }
}
