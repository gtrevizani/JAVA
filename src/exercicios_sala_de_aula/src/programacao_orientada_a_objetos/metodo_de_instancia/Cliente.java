package programacao_orientada_a_objetos.metodo_de_instancia;

public class Cliente {
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String email;

    String obterNomeCompleto() {
        String nomeCompleto = primeiroNome + " " + ultimoNome;
        return nomeCompleto;
    }

    String obterDDD() {
        String ddd = telefone.substring(0, 2);
        return ddd;
    }

    static String obterNomeCompleto(Cliente cliente) {
        String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
        return nomeCompleto;
    }
}
