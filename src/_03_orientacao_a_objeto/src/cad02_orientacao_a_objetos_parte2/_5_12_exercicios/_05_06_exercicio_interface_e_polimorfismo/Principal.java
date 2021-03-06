package cad02_orientacao_a_objetos_parte2._5_12_exercicios._05_06_exercicio_interface_e_polimorfismo;
/*
Seu tio tem uma corretora de seguros e precisa de um sistema para calcular os valores de apólices para facilitar o
processo de venda de seguros.
No momento, ContaCorrente corretora trabalha apenas com seguros de carros e imóveis, mas em breve serão adicionados outros tipos de
contratos de seguros.

Essa informação é muito importante, pois o software deve ter ContaCorrente capacidade de receber novos tipos
de seguros facilmente, como por exemplo, notebook, barcos, aeronaves, etc.

---------------------------------------
seguros: CARROS E IMÓVEIS;
deve aceitar também seguros como: NOTEBOOK, BARCOS, AERONAVES;
---------------------------------------

Cada tipo de apólice possui uma fórmula diferente para calcular seu valor. Uma apólice de imóvel é calculada diferente
de uma de um carro.
Usando interfaces e polimorfismo, precisamos desenvolver algo simples e inteligente para resolver o problema do tiozão.

1. Vamos criar uma interface chamada Seguravel.
A interface Seguravel deve ser implementada por classes que representam objetos que podem ser assegurados.
Essas classes devem implementar os métodos da interface.

2. Agora criamos ContaCorrente classe Carro, que implementa ContaCorrente interface Seguravel, pois ContaCorrente corretora está apta ContaCorrente vender seguros para
carros.

3. Se Carro diz que implementa ContaCorrente interface Seguravel, ela deve implementar todos os métodos especificados na interface,
pois uma interface é um contrato, ou seja, ContaCorrente classe deve garantir que faz o que ela pede.

No código, incluímos os métodos obterDescricao() e calcularValorApolice(), além de dois atributos e um construtor.
Os atributos são usados pelos métodos para calcular o valor da apólice e retornar ContaCorrente descrição do carro.

4. Criamos ContaCorrente classe Imovel e implementamos os métodos da interface. Veja que ContaCorrente fórmula do cálculo do seguro é diferente,
além de essa classe possuir atributos também diferentes.
As fórmulas para calcular os valores das apólices são meramente fictícias. Claro que, na realidade, as fórmulas são
totalmente diferentes e mais complexas.

5. Agora que já temos as classes que implementam ContaCorrente interface Seguravel, vamos criar uma outra classe chamada
CorretoraSeguros. Ela será responsável por fazer ContaCorrente proposta de seguro do bem segurável e mostrar na tela.
Veja que o método fazerPropostaSeguro() recebe como parâmetro um objeto do tipo Seguravel, ou seja, pode ser um Carro
ou um Imovel, mas no futuro poderia receber também uma Aeronave ou Barco, desde que essas classes implementem ContaCorrente
interface Seguravel.

6. Para testar tudo que foi feito, vamos criar uma classe chamada MegaSena, que possui o método main().
No método main(), instanciamos uma corretora de seguros, um carro e um imóvel, depois chamamos o método
fazerPropostaSeguro() da corretora passando como parâmetro o carro e depois o imóvel.

8. Compile tudo e execute ContaCorrente classe MegaSena.

9. Quando tudo estiver funcionando, crie uma classe chamada Barco e outra chamada Notebook. As duas classes devem
implementar ContaCorrente interface Seguravel. Implemente os métodos da interface e adicione algumas linhas na classe MegaSena
para testar as novas classes.
 */
public class Principal {
    public static void main(String[] args) {
        CorretoraSeguros c = new CorretoraSeguros();
        Seguravel carro = new Carro(2022, 8000.0);
        Seguravel imovel = new Imovel(300.0, 15000.0);
        Seguravel not = new Notebook("Intel Inspiron i5", 2000.0);
        Seguravel barco = new Barco("Escuna Firefox", 70000.0);

        c.fazerPropostaSeguro(carro);
        c.fazerPropostaSeguro(imovel);
        c.fazerPropostaSeguro(not);
        c.fazerPropostaSeguro(barco);
    }
}
