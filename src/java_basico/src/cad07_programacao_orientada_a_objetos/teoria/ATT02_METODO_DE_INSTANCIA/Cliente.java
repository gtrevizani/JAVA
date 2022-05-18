package cad07_programacao_orientada_a_objetos.teoria.ATT02_METODO_DE_INSTANCIA;

public class Cliente { // Objeto;
    String primeiroNome; // Atributos objeto;
    String ultimoNome;
    String telefone;
    String email;

    String obterNomeCompleto() {
        String nomeCompleto = primeiroNome + " " + ultimoNome; // Variável que pega primeiro e último nome;
        return nomeCompleto; // Retorna nome completo;
    } // Método de chamada

    String obterDDD() {
        String ddd = telefone.substring(0, 2); // Variável que pega os 3 primeiros números;
        return ddd; // Retorna o DDD;
    } // Método de chamada

    static String obterNomeCompleto(Cliente cliente) {
        String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome; // Cria dois novos atributos;
        return nomeCompleto; // Retorna nome completo;
    } // Método de chamada
}
