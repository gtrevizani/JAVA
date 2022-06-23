package cad03_topicos_avancados._6_6_collections_framework;

import java.util.HashSet;
import java.util.Set;

public class TesteSetHashSet {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Maria");
        Aluno a3 = new Aluno("José");
        Aluno a4 = new Aluno("Pedro");

        Set<Aluno> alunos = new HashSet<>(); // Usado quando não há valores repetidos;

        alunos.add(a1);
        alunos.add(a2);
        alunos.add(a3);
        alunos.add(a4);

        imprimirAlunos(alunos);
    }

    private static void imprimirAlunos(Set<Aluno> alunos) {
        for(Aluno a : alunos){
            System.out.println("Nome: " + a.getNome());
        }
    }
}
