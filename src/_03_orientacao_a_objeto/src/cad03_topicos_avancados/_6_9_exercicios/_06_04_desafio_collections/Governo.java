package cad03_topicos_avancados._6_9_exercicios._06_04_desafio_collections;

import java.util.*;
import java.math.BigDecimal;
/*

1° Criação de um atributo em forma de lista para armazenar políticos por estado da federação.
2° Criação de um constructor que transforme o atributo em HashMap.
3° Criação de um método que receba um mapa com Politicos e seu Partido.
    - 1° condição: Crie uma lista que faz uma pesquisa do partido em específico.
    - 2° condição: Se a lista de politicos estiver vazia, instancie uma nova.
    - 3° condição: Adicione o politico à lista dos politicos.
    - 4° condição: Deve adicionar os partidos e os politicos de cada partido ao mapa com o comando put.

 */
public class Governo {
    // 1° criação: atributo privado em forma de lista que recebe como chave o seu partido e seu valor como políticos.
    private Map<String, List<Politico>> partidosPoliticos;

    // 1° linha: criação do constructor partidosPoliticos
    // 2° linha: constructor transformado em HashMap, que recebe String partido e List politicos.
    public Governo() {
        this.partidosPoliticos = new HashMap<String, List<Politico>>();
    }

    // 1° linha: Método abaixo recebe a chave como String partidoPolitico, depois recebe o valor como Objeto Politico.
    // 2° linha: Lista politicos faz uma pesquisa do partidoPolitico em questão.
    // 3° linha: Um if como condição, para testar se existem listas para os partidos politicos em questão, se for nula, crie uma.
    // 6° linha: A lista em questão adiciona o politico.
    // 7° linha: O constructor adiciona a chave e o valor.
    public void adicionarPolitico(String partidoPolitico, Politico politico) {
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
        if (politicos == null) {
            politicos = new ArrayList<Politico>();
        }
        politicos.add(politico);
        this.partidosPoliticos.put(partidoPolitico, politicos);
    }

    // 1° linha: Método abaixo recebe a chave String partidoPolitico.
    // 2° linha: Criado uma variável do tipo BigDecimal de valor iniciado em 0.
    // 3° linha: Lista politicos faz uma pesquisa do partidoPolitico em questão.
    // 4° linha: Um if como condição, para percorrer a Lista caso ela não seja nula.
    // 6° linha: A variável faz uma soma dos Salários do Cargo em específico.
    // 9° linha: retorna a soma dos salarios.
    public BigDecimal calcularGastosComSalario(String partidoPolitico) {
        BigDecimal total = BigDecimal.ZERO;
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
        if(politicos != null){
            for (Politico p1 : politicos){
                total = total.add(p1.getCargo().getSalario());
            }
        }
        return total;

    }
    // 1° linha: Método abaixo recebe a chave String partidoPolitico e o valor Cargo.
    // 2° linha: Criado uma variável do tipo BigDecimal de valor iniciado em 0.
    // 3° linha: Lista politicos faz uma pesquisa do partidoPolitico em questão.
    // 4° linha: Um if como condição, para percorrer a Lista caso ela não seja nula.
    // 6° linha: Um if como condição, para consultar se a pesquisa do Cargo é igual o cargo em questão.
    // 7° linha: A variável faz uma soma dos Salários do Cargo em específico.
    // 12° linha: retorna a soma dos salarios.
    public BigDecimal calcularGastosComSalarioParaCargo(Cargo cargo, String partidoPolitico) {
        BigDecimal gastoComSalarioDeCargo = new BigDecimal(0);
        List<Politico> politicos = this.partidosPoliticos.get(partidoPolitico);
        if(politicos != null){
            for(Politico p2 : politicos){
                if(p2.getCargo() == cargo){
                    gastoComSalarioDeCargo = gastoComSalarioDeCargo.add(p2.getCargo().getSalario());
                }
            }
        }
        return gastoComSalarioDeCargo;

    }
}