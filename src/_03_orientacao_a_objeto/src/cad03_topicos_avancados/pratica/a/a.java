package cad03_topicos_avancados.pratica.a;
/*
No desafio sobre herança e sobreposição, quando uma conta a pagar ou receber não podia ser paga, recebida ou cancelada, apenas exibíamos na tela uma mensagem usando a instrução System.out.println.
Agora, neste desafio, você deve rever as mensagens de erro dos métodos ContaPagar.pagar(), ContaReceber.receber(), ContaReceber.cancelar() e Conta.cancelar() para lançar uma exceção.
A exceção a ser lançada por esses métodos deve-se chamar OperacaoContaException. A classe dessa exceção ainda não existe, então você precisará criá-la com o código abaixo:
public class OperacaoContaException extends Exception {
	public OperacaoContaException(String msg) {
		super(msg);
	}
}
Na classe Principal, que é a responsável por instanciar todos os objetos necessários e invocar os métodos, use as instruções try/catch para capturar a exceção OperacaoContaException durante as chamadas aos métodos que executam operações em contas.
 */
public class Principal{
  
}
