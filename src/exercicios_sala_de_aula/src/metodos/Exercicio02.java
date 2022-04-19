package metodos;

/*
Identifique um novo padrão no algoritmo do código anterior.
Estude um pouco mais o algoritmo do código passado, e identifique algum trecho dele que pode ser separado para colocar
em um novo método criado por você.
 */

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();
        String[] cursos = new String[]{"Java EE", "Spring", "Java OO Avançado"};
        imprimirAbaixo("Escolha dentre os cursos abaixo: ");
        exibirOpcoesCursos(cursos);
        imprimirNaLinha("O curso que você deseja é o: ");
        int cursoEscolhido = scanner.nextInt();
        boolean opcaoDeCursoValido = cursoEscolhido >= 0 && cursoEscolhido < cursos.length;
        testeOpcaoDeCursoValido(opcaoDeCursoValido);

        imprimirTraco();
        String[] formasPagamento = new String[]{"Cartão", "Boleto"};
        imprimirAbaixo("Escolha dentre as formas de pagamento abaixo: ");
        exibirOpcoesPagamentos(formasPagamento);
        imprimirNaLinha("Sua forma de pagamento desejada é: ");
        int formaDePagamento = scanner.nextInt();
        opcaoDeCursoValido = formaDePagamento >= 0 && formaDePagamento < formasPagamento.length;
        testeOpcaoDeCursoValido(opcaoDeCursoValido);

        imprimirTraco();
        String posicaoCursoEscolhido = cursos[cursoEscolhido];
        String opcaoFormaPagamento = formasPagamento[formaDePagamento];
        imprimirTraco();
        imprimirAbaixo("O curso escolhido foi " + posicaoCursoEscolhido + " e a forma de pagamento é " + opcaoFormaPagamento + ".");
        scanner.close();
    }

    static void imprimirTraco() {
        System.out.println("------------------------------------------------");
    }
    static void encerrar() {
        System.err.println("Posição inválida!");
        System.exit(1);
    }
    static void testeOpcaoDeCursoValido(boolean opcaoDeCursoValido) {
        if(!opcaoDeCursoValido){
            encerrar();
        }
    }
    static void imprimirAbaixo(String texto){
        System.out.println(texto);
    }
    static void imprimirNaLinha(String texto){
        System.out.print(texto);
    }
    static void exibirOpcoesCursos(String [] cursos){
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("[" + i + "]" + cursos[i]);
        }
    }
    static void exibirOpcoesPagamentos(String [] formasPagamento){
        for(int i = 0; i < formasPagamento.length; i++){
            System.out.println("[" + i + "]" + formasPagamento[i]);
        }
    }
}
