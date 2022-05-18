package cad07_programacao_orientada_a_objetos.teoria.ATT03_ENCAPSULAMENTO;

public class Encapsulamento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(); // Objeto instanciado

//        cliente.primeiroNome = "Filipe";
//        System.out.println("Primeiro nome " + cliente.primeiroNome);


        cliente.setNome("Filipe Vaz"); // Objeto e método de atribuição
        cliente.setTelefone("27999999999"); // Objeto e método de atribuição

        System.out.println("Nome cliente: " + cliente.getNome()); // Objeto e método de chamada do atributo
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome()); // Objeto e método de chamada do atributo
        System.out.println("Último nome: " + cliente.getUltimoNome()); // Objeto e método de chamada do atributo
    }
}
