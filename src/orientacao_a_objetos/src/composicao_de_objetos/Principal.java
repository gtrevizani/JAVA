package composicao_de_objetos;

public class Principal {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";

        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "João";
        meuCarro.dono.idade = 32;
        meuCarro.dono.cpf = "17865436901";
        meuCarro.dono.bairro = "Centro";
        meuCarro.dono.cidade = "Cafézal";
        meuCarro.dono.logradouro = "Rua Bruxelas, n° 189";
    }
}
