package cad02_orientacao_a_objetos_parte2._5_4_modificador_de_acesso_default;

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
