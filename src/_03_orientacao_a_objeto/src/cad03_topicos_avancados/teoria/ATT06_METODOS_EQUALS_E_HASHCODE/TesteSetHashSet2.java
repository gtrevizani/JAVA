package cad03_topicos_avancados.teoria.ATT06_METODOS_EQUALS_E_HASHCODE;

import java.util.Set;

public class TesteSetHashSet2 {
    public static void main(String[] args) {
        Set<Aluno> alunos = SimuladorBancoDeDados.buscarAlunos(); // Seleciona todos os alunos

        // De alguma forma, sorteia o nome de aluno e constrói o objeto Aluno
        Aluno alunoSorteado = new Aluno("Maria");

        if(alunos.contains(alunoSorteado)){ // Se alunos contém o alunoSorteado, executa.
            System.out.println("Parabéns " + alunoSorteado.getNome() + "! Você ganhou um brinde! ");
        } else {
            System.out.println("Aluno não cadastrado no banco de dados.");
        }
    }
}
