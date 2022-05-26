package cad02_orientacao_a_objetos_parte2.teoria.ATT05_ENUMERACOES;

public enum OperacaoAritmetica {
    ADICAO { // Propriedade
        public int operacao(int x, int y){
            return x + y;
        } // Método de manipulação do método para uso
    },
    SUBTRACAO{ // Propriedade
        public int operacao(int x, int y){
            return x - y;
        } // Método de manipulação do método para uso
    };
    public abstract int operacao(int x, int y); // Método para uso
}
