package cad02_orientacao_a_objetos_parte2._5_2_encapsulamento_e_modificadores_de_acesso;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado(); // Instanciamento
        ar.trocarTemperatura(21); // Método
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");
        ar.trocarTemperatura(10); // Método
        System.out.println("Temperatura do ar: " + ar.obterTemperatura() + "°");

    }

}
