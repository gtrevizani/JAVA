package cad02_orientacao_a_objetos_parte2._5_1_objeto_this;

public class ExemploThis {
    public static void main(String[] args) {
        Carro carro = new Carro(); // Instanciamento
        carro.modelo = "Palio"; // Objeto e atributo
        System.out.println("Modelo antes: " + carro.modelo); // Exibição objeto e atributo
        carro.alterarModelo("Civic"); // Método alterarModelo
        System.out.println("Modelo depois: " + carro.modelo); // Exibição objeto e atributo
    }
}
