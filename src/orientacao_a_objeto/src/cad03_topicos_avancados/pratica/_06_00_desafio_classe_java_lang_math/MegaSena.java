package cad03_topicos_avancados.pratica._06_00_desafio_classe_java_lang_math;

public class MegaSena {

    public static final int NUMERO_MAXIMO = 60;
    public static final int QUANTIDADE_NUMEROS = 6;

    private int[] numerosSorteados; // Vetor

    public void sortear(){
        this.numerosSorteados = new int[QUANTIDADE_NUMEROS]; // Vetor e espaços
        for (int i = 1; i <=QUANTIDADE_NUMEROS; i++){
            //gera número aleatório, arredonda e converte para inteiro
            int numeroSorteado = (int) Math.round(Math.random() * NUMERO_MAXIMO);

            //verifica se número ainda não foi soteado e não é 0
            if (!this.jaFoiSorteado(numeroSorteado) && numeroSorteado != 0 ) {
                this.numerosSorteados[i-1] = numeroSorteado; //adiciona o número sorteado no array de números sorteados
            } else {
                //decrementa i para regazer o sorteio da mesma posição
                i--;
            }
        }
    }

    public void exibirNumeros(){
        for (int numeroSorteado : numerosSorteados) {
            System.out.println(numeroSorteado + " ");
        }
        //quebra de linha
        System.out.println();
    }


    private boolean jaFoiSorteado(int numero) {
        boolean resultado = false;
        for (int i = 0; i < this.numerosSorteados.length; i++) {
            if (this.numerosSorteados[i] == numero){
                resultado = true;
                break;
            }
        }
        return resultado;
    }
}

