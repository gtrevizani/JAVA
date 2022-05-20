package cad02_rientacao_a_objetos_parte2.teoria.ATT03_MODIFICADOR_DE_ACESSO_DEFAULT;

public class Cachorro { // Objeto
    private String nome; // Atributo privado

    public String getNome() {
        return nome;
    } // Método de chamada

    public void setNome(String nome) {
        this.nome = nome;
    } // Método de atribuição

    public void sentar(){
        System.out.println("Eu, " + nome + ", vou sentar!");
    } // Método de exibição
}
