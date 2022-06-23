package cad01_orientacao_a_objetos._4_3_composicao_de_objetos;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); // Instanciamento
        meuCarro.anoDeFabricacao = 2011; // Objeto e atributos
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";

        meuCarro.dono = new Proprietario(); // Instaciamento de dois objetos
        meuCarro.dono.nome = "João"; // Objetos e atributo
        meuCarro.dono.idade = 32;
        meuCarro.dono.cpf = "17865436901";
        meuCarro.dono.bairro = "Centro";
        meuCarro.dono.cidade = "Cafézal";
        meuCarro.dono.logradouro = "Rua Bruxelas, n° 189";
    }
}
