package cad07_programacao_orientada_a_objetos.teoria.ATT02_METODO_DE_INSTANCIA;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(); // Instaciamento
        cliente.primeiroNome = "Alexandre"; // Objeto e atributo
        cliente.ultimoNome = "Afonso";
        cliente.telefone = "349000000";
        cliente.email = "alexandre.afonso@algawork.com";

        Cliente cliente2 = new Cliente(); // Instanciamento
        cliente2.primeiroNome = "João"; // Objeto e atributo
        cliente2.ultimoNome = "Silva";
        cliente2.telefone = "3489999999";


        System.out.println("Nome cliente: " + Cliente.obterNomeCompleto(cliente)); // Método estático (não precisa instanciar)

        System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + ", DDD: " + cliente.obterDDD()); // Objeto e método
        System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + ", DDD: " + cliente2.obterDDD()); // Objeto e método
    }
}
