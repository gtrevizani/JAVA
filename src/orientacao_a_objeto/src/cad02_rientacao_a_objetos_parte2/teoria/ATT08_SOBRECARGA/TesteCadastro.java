package cad02_rientacao_a_objetos_parte2.teoria.ATT08_SOBRECARGA;

public class TesteCadastro {
    public static void main(String[] args) {
        CadastroPessoa cadastro = new CadastroPessoa();
        Pessoa pessoa = new Pessoa("José", 32);
        cadastro.cadastrar(pessoa);
        cadastro.cadastrar("Maria", 25);
    }
}
