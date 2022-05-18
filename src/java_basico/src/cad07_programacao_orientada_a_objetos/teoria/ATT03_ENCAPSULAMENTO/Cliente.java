package cad07_programacao_orientada_a_objetos.teoria.ATT03_ENCAPSULAMENTO;

public class Cliente {
    //String nome;
    String primeiroNome; // Atributo interno (requer instanciamento)
    String ultimoNome; // Atributo interno (requer instanciamento)
    String telefone; // Atributo interno (requer instanciamento)

    public String getNome() {
        return primeiroNome + " " + ultimoNome ;
    } // Método de chamada

    public void setNome(String nome) {
        String[] nomeCompleto = nome.split(" "); // Divisão de variaveis com vetor
        primeiroNome  = nomeCompleto[0];
        ultimoNome = nomeCompleto[1];
    } // Método de atribuição

    public String getPrimeiroNome() {
        return primeiroNome;
    } // Método de chamada

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    } // Método de atribuição

    public String getUltimoNome() {
        return ultimoNome;
    } // Método de chamada

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    } // Método de atribuição

    public String getTelefone() {
        return telefone;
    }  // Método de chamada

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    } // Método de atribuição
}
