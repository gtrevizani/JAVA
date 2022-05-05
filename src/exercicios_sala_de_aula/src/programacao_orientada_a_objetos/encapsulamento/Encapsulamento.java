package programacao_orientada_a_objetos.encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

//        cliente.primeiroNome = "Filipe";
//        System.out.println("Primeiro nome " + cliente.primeiroNome);


        cliente.setNome("Filipe Vaz");
        cliente.setTelefone("27999999999");
        System.out.println("Nome cliente: " + cliente.getNome());
        System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
        System.out.println("Último nome: " + cliente.getUltimoNome());
    }
}
